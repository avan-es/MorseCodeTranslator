import Services.MorseService;

import  javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

import static Constants.MorseConstance.*;

public class AppMorse {
    public static void main(String[] args) throws IOException {

        String test = "ПРИВЕТ МИР";
        Character ch;
        String test2 = ".--. .-. .. .-- . - ~-- .. .-.";


        MorseService service = new MorseService();
        StringBuilder result = service.symbolsToMorse(test);

        System.out.println(service.morseToSymbols(test2));

        System.out.println(result);
        for (int i = 0; i < result.length(); i++) {
            switch (result.charAt(i)) {
                case '.': extracted(DOT_PATCH); break;
                case '-':  extracted(DASH_PATCH);break;
                case ' ': extracted(SPACE_PATCH);break;
                default: extracted(PAUSE_PATCH);break;
            }

        }

    }

    private static void extracted(String patch) {
        try {
            File soundFile = new File(patch);
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
            while(clip.getMicrosecondLength() != clip.getMicrosecondPosition())
            {
            }
//            clip.wait();
//            Thread.sleep(clip.getMicrosecondLength()/10);
//            clip.stop(); //Останавливаем
//           clip.close(); //Закрываем
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
//             } catch (InterruptedException exc) {}
        }
    }

}

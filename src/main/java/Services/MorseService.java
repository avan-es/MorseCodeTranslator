package Services;

import java.util.List;

import static MorseDictionary.MorseDictionary.*;

import static Constants.MorseConstance.SEPARATOR;

public class MorseService {

    public StringBuilder symbolsToMorse(String message) {
        StringBuilder result = new StringBuilder();
        Character ch;
        for (int i = 0; i < message.length(); i++) {
            ch = message.charAt(i);
            if(ch == ' ') {
                result.append(SEPARATOR);
            } else {
                result.append(RUS_TO_MORSE.get(ch)).append(' ');
            }

        }
        return result;
    }

    public StringBuilder morseToSymbols(String message) {
        StringBuilder result = new StringBuilder();
        List<String> words = List.of(message.split("~"));
        for (String word: words) {
            List<String> symbols = List.of(word.split(" "));
            for (String symbol: symbols) {
                result.append(FROM_MORSE.get(symbol));
            }
            result.append(" ");
        }
        return result;
    }

}

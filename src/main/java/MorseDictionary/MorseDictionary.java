package MorseDictionary;

import java.util.HashMap;
import java.util.Map;

public final class MorseDictionary {

     public static final Map<Character, String> RUS_TO_MORSE = new HashMap<>();
     public static final Map<Character, String> EN_TO_MORSE = new HashMap<>();
     public static final Map<Character, String> NUM_TO_MORSE = new HashMap<>();
     public static final Map<Character, String> SYMBOLS_TO_MORSE = new HashMap<>();
     public static final Map<String, Character> FROM_MORSE;

     static
             {
                  fillRusToMorse();
                  fillEnToMorse();
                  fillNumToMorse();
                  fillSymToMorse();
                  FROM_MORSE = fillFromMorse();
             }

     private MorseDictionary() {
     }

     private static void fillRusToMorse() {
          RUS_TO_MORSE.put('А', ".-");
          RUS_TO_MORSE.put('Б', "-...");
          RUS_TO_MORSE.put('В', ".--");
          RUS_TO_MORSE.put('Г', "--.");
          RUS_TO_MORSE.put('Д', "-..");
          RUS_TO_MORSE.put('Е', ".");
          RUS_TO_MORSE.put('Ё', ".");
          RUS_TO_MORSE.put('Ж', "...-");
          RUS_TO_MORSE.put('З', "--..");
          RUS_TO_MORSE.put('И', "..");
          RUS_TO_MORSE.put('Й', ".---");
          RUS_TO_MORSE.put('К', "-.-");
          RUS_TO_MORSE.put('Л', ".-..");
          RUS_TO_MORSE.put('М', "--");
          RUS_TO_MORSE.put('Н', "-.");
          RUS_TO_MORSE.put('О', "---");
          RUS_TO_MORSE.put('П', ".--.");
          RUS_TO_MORSE.put('Р', ".-.");
          RUS_TO_MORSE.put('С', "...");
          RUS_TO_MORSE.put('Т', "-");
          RUS_TO_MORSE.put('У', "..-");
          RUS_TO_MORSE.put('Ф', "..-.");
          RUS_TO_MORSE.put('Х', "....");
          RUS_TO_MORSE.put('Ц', "-.-.");
          RUS_TO_MORSE.put('Ч', "---.");
          RUS_TO_MORSE.put('Ш', "----");
          RUS_TO_MORSE.put('Щ', "--.-");
          RUS_TO_MORSE.put('Ь', "-..-");
          RUS_TO_MORSE.put('Ъ', "--.--");
          RUS_TO_MORSE.put('Ы', "-.--");
          RUS_TO_MORSE.put('Э', "..-..");
          RUS_TO_MORSE.put('Ю', "..--");
          RUS_TO_MORSE.put('Я', ".-.-");

     }

     private static void fillEnToMorse() {
          EN_TO_MORSE.put('A', ".-");
          EN_TO_MORSE.put('B', "-...");
          EN_TO_MORSE.put('C', "-.-.");
          EN_TO_MORSE.put('D', "-..");
          EN_TO_MORSE.put('E', ".");
          EN_TO_MORSE.put('F', "..-.");
          EN_TO_MORSE.put('G', "--.");
          EN_TO_MORSE.put('H', "....");
          EN_TO_MORSE.put('I', "..");
          EN_TO_MORSE.put('J', ".---");
          EN_TO_MORSE.put('K', "-.-");
          EN_TO_MORSE.put('L', ".-..");
          EN_TO_MORSE.put('M', "--");
          EN_TO_MORSE.put('N', "-.");
          EN_TO_MORSE.put('O', "---");
          EN_TO_MORSE.put('P', ".--.");
          EN_TO_MORSE.put('Q', "--.-");
          EN_TO_MORSE.put('R', ".-.");
          EN_TO_MORSE.put('S', "...");
          EN_TO_MORSE.put('T', "-");
          EN_TO_MORSE.put('U', "..-");
          EN_TO_MORSE.put('V', "...-");
          EN_TO_MORSE.put('W', ".--");
          EN_TO_MORSE.put('X', "-..-");
          EN_TO_MORSE.put('Y', "-.--");
          EN_TO_MORSE.put('Z', "--..");
     }

     private static void fillNumToMorse() {
          NUM_TO_MORSE.put('1',".----");
          NUM_TO_MORSE.put('2',"..---");
          NUM_TO_MORSE.put('3',"...--");
          NUM_TO_MORSE.put('4',"....-");
          NUM_TO_MORSE.put('5',".....");
          NUM_TO_MORSE.put('6',"-....");
          NUM_TO_MORSE.put('7',"--...");
          NUM_TO_MORSE.put('8',"---..");
          NUM_TO_MORSE.put('9',"----.");
          NUM_TO_MORSE.put('0',"-----");
     }

     private static void fillSymToMorse() {
          SYMBOLS_TO_MORSE.put('.',"......");
          SYMBOLS_TO_MORSE.put(',',".-.-.-");
          SYMBOLS_TO_MORSE.put(':',"---...");
          SYMBOLS_TO_MORSE.put(';',"-.-.-");
          SYMBOLS_TO_MORSE.put('(',"-.--.-");
          SYMBOLS_TO_MORSE.put(')',"-.--.-");
          SYMBOLS_TO_MORSE.put('\'',".----.");
          SYMBOLS_TO_MORSE.put('"',".-..-.");
          SYMBOLS_TO_MORSE.put('«',".-..-.");
          SYMBOLS_TO_MORSE.put('»',".-..-.");
          SYMBOLS_TO_MORSE.put('-',"-....-");
          SYMBOLS_TO_MORSE.put('/',"-..-.");
          SYMBOLS_TO_MORSE.put('_',"..--.-");
          SYMBOLS_TO_MORSE.put('?',"..--..");
          SYMBOLS_TO_MORSE.put('!',"--..--");
          SYMBOLS_TO_MORSE.put('+',".-.-.");
          SYMBOLS_TO_MORSE.put('=',"-...-");
     }

     private static Map<String, Character>  fillFromMorse() {
          Map<String, Character> result = new HashMap<>();
          for (Map.Entry<Character,String> entry : RUS_TO_MORSE.entrySet()) {
               if(!result.containsKey(entry.getValue())) {
                    result.put(entry.getValue(), entry.getKey());
               } else {
                    result.replace(entry.getValue(), entry.getKey());
               }
          }
          return result;
     }

}
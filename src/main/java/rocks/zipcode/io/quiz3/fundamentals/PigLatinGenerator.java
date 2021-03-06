package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {


    public String translate(String str) {
        VowelUtils vw = new VowelUtils();
        //String lowerCaseWord = str.toLowerCase();
        int pos = -1; // Position of first vowel
        char ch;

        // This for loop finds the index of the first vowel in the word
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (isVowel(ch)) {
                pos = i;
                break;
            }
        }

        if (pos == 0) {
            // Translating word if the first character is a vowel (Rule 3)
            return str + "way"; // Adding "yay" to the end of string (can also be "way" or just "ay")
        } else {
            // Translating word if the first character(s) are consonants (Rule 1 and 2)
            String a = str.substring(pos); // Extracting all characters in the word beginning from the 1st vowel
            String b = str.substring(0, pos); // Extracting all characters located before the first vowel
            return a + b + "ay"; // Adding "ay" at the end of the extracted words after joining them.
        }
    }
        public static Boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
        return false;
    }
    }




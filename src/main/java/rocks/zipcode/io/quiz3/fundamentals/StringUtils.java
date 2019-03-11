package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {

    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
       /* str = str.substring(0,indexToCapitalize)
                + str.substring(indexToCapitalize,indexToCapitalize+1).toUpperCase()
                + str.substring(indexToCapitalize);*/


        char[] arr = str.toCharArray();
        // Modify first element in array.
        arr[indexToCapitalize] = Character.toUpperCase(arr[indexToCapitalize]);
        str = new String(arr);

        return str;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {


        return (baseString.indexOf(characterToCheckFor) == indexOfString);


    }


    public static String[] getAllSubStrings(String string) {

        int substringsCount = string.length() * (string.length() + 1) / 2;


        List<String> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                list.add(string.substring(i, j));
                // System.out.println(list);
            }

        }
        String[] stockArr = list.toArray(new String[0]);


        return stockArr;
    }

    public static Integer getNumberOfSubStrings(String input) {
        int substringsCount = input.length() * (input.length() + 1) / 2-1;
        return substringsCount;

    }
}




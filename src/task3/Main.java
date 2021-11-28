package task3;

import java.util.Arrays;

/**
 * Task 3
 * StringSplit.solution("abc") // should return {"ab", "c_"}
 * StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
 * */

public class Main {

    public static void main(String[] args) {

        String[] array = pairArray("abcdef");
        for(String pair: array) {
            System.out.println(pair);
        }
    }

    private static String[] pairArray(String string) {
        int stringLength = string.length();
        int sizeArray;
        String[] resultArray;
        String copiedString;
        if (stringLength % 2 == 0) {
            sizeArray = stringLength / 2;
            copiedString = string;
        } else {
            sizeArray = (stringLength / 2) + 1;
            copiedString = string + "_";
        }
        resultArray = new String[sizeArray];
        int step = 0;
        for (int i = 0; i < sizeArray; i++) {
            if (i == 0) {
                String firstCharOfPair = String.valueOf(copiedString.charAt(i));
                String secondCharOfPair = String.valueOf(copiedString.charAt(i + 1));
                resultArray[i] = firstCharOfPair + secondCharOfPair;
            } else {
                int newIndex = i + step;
                String firstCharOfPair = String.valueOf(copiedString.charAt(newIndex));
                String secondCharOfPair = String.valueOf(copiedString.charAt(newIndex + 1));
                resultArray[i] = firstCharOfPair + secondCharOfPair;
            }
            step++;
        }

        return resultArray;
    }
}

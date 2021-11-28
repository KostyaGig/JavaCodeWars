package task1;


import java.util.Locale;

/**
 * Task: we should the same amount 'x' and '0' in src string
 * Condition: ignore case
 * */
public class Main {

    public static void main(String[] args) {
        System.out.println(same("XOx123xoO")); // true
        System.out.println(same("xXOx123xoO")); // false

        System.out.println(same("XOx123xoO",3)); // true
        System.out.println(same("XO123xoO",2)); // true

        System.out.println(getXO("XOx123xoOx")); // false
        System.out.println(getXO("XOx123xoO")); // false
    }

    private static boolean same(String str){
        int countX = 0;
        int countY = 0;
        String newString = str.toLowerCase();
        char[] chars = newString.toCharArray();
        for(char item: chars) {
            if (item == 'x') {
                countX++;
            } else if (item == 'o') {
                countY++;
            }
        }
        return countX == countY;
    }

    private static boolean same(String str,int expectedAmountPair) {
        int amountPair = 0;
        String newString = str.toLowerCase();
        char[] chars = newString.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            int leftChar = chars[i];
            int rightChar = chars[i + 1];
            if (leftChar == 'x') {
                if (rightChar == 'o') {
                    amountPair++;
                }
            } else if (leftChar == 'o') {
                if (rightChar == 'x') {
                    amountPair++;
                }
            }
        }

        return expectedAmountPair == amountPair;
    }

    public static boolean getXO (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();
    }
}

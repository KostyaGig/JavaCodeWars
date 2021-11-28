package task2;

/**
 * We have random str,which have any amount length
 * We should take chars from middle string
 * Example: Src string: "A" output: "A"
    Src string: "Middle" output: "dd"
    Src string: "laptopo" output: "pto"
 * */

public class Main {

    public static void main(String[] args) {
        System.out.println(middle("1234567")); // "4"
        System.out.println(middle("123456789")); // "5"
        System.out.println(middle("1")); // "1"

        System.out.println(half("1234")); // "23"
        System.out.println(half("12345")); // "23"
    }

    private static String middle(String word) {
        String newString = "";
        int stringLength = word.length();
        if (stringLength % 2 == 0) {
            int startIndex = (stringLength / 2) - 1;
            int endIndex = (stringLength / 2) + 1;
            newString = word.substring(startIndex,endIndex);
        } else {
            double startIndex = (double) (stringLength / 2);
            double endIndex = (double) (stringLength / 2) + 1;
            newString = word.substring((int) startIndex,(int) endIndex);
        }
        return newString;
    }

    private static String half(String str) {
        String newString = "";
        int length = str.length();
        int half = length / 2;

        if (length % 2 == 0) {
            newString = str.substring(half - 1,half + 1);
        } else {
            System.out.println(" not % 2 half " + half);
            newString = str.substring(half,half  + 1);
        }

        return newString;
    }
}

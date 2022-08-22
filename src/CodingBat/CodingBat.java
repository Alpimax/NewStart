package CodingBat;

public class CodingBat {
    public static void main(String[] args) {


    }

    public static String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += "" + str.charAt(i) + str.charAt(i);


        }
        return newStr;

    }

    public static String doubleIt(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += "" + str.charAt(i) + str.charAt(i);


        }
        return newStr;

    }
}





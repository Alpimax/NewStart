package list;

public class HomeWork {


    public static void main(String[] args) {

        System.out.println(divideOperator(100, 10));
    }

    public static String oddEven(int number) {
        //1) Numbers - odd & even
//Write  a method which can identifies given number is even or odd
//EX:
//identify(5) ->  "Odd"
//identify(6) ->  "Even"
        if (number < 0) {
            return "Negative number !!!";
        } else if (number == 0) {
            return "Your number is 0 !!!";
        }

        if (number % 2 == 0) {
            return "Even";
        } else
            return "Odd";

    }

    public static int divideOperator(int number, int num) {
        //   2) Numbers - Divide without / operator
//Write a method that can divide two numbers without using division operator
        int count = 0;

        while (number > 0) {
            number -= num;
            count++;
        }

        return count;
    }

//     Numbers - FINRA
//Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.

    public
}

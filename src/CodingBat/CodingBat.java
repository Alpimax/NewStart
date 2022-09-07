package CodingBat;


public class CodingBat {
    public static void main(String[] args) {


        int number = 6232416;
        int count = 0;
        int total = 0;
        int value;
        int temp = number;

        while (temp > 0) {
            temp /= 10;
            count++;
        }
        System.out.println(count);
        System.out.println(temp);
        temp = number;
        while (temp > 0) {
            value = temp % 10;
            total += Math.pow(value, count);
            temp /= 10;
        }
        System.out.println(number == total ? "this is Armstrong. " : "this is not Armstrong.");
    }

    {

    }

}
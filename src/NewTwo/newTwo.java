package NewTwo;

import java.net.CacheRequest;

public class newTwo {


    public static void main(String[] args) {
        System.out.print("Alper");
        System.out.println();
        System.out.println("alper");
        String website = "it comes from Github";
        System.out.println(website);
        int numberOfLength = website.length();
        System.out.println(numberOfLength);
        camelCase("alper");
    }


    public static void camelCase(String name) {
        System.out.println(name.toUpperCase().charAt(0) + name.toLowerCase().substring(1));

    }
}

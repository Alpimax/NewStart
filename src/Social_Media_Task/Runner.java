package Social_Media_Task;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        Facebook obj = new Facebook("Megan Tice", "Megan");
        obj.notifications();
        System.out.println(obj);
        System.out.println(obj);
        Instagram obj1 = new Instagram("Megan Tice", "Megan");
        System.out.println(obj1);
    }
}

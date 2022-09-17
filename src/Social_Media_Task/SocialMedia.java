package Social_Media_Task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class SocialMedia {

    String personalUrl;
    int accountLength;
    static String platform ;
    String username;
    String password;
    String fullName;

    public SocialMedia(String username, String password) {
        this.username = username;

        if (password.contains(username)) {
            System.out.println("Password contained username.");
        } else {
            System.out.println("password created");
            this.password = password;
        }
    }

    public SocialMedia(String username, String password, String fullName) {
        this(username, password);
        boolean isChar = false;
        for (int i = 0; i < fullName.length(); i++) {
            if (!Character.isAlphabetic(fullName.charAt(i))) {
                isChar = true;
            }
        }
        if (isChar) {
            System.out.println("invalid name");
            this.fullName = "No name";
        } else
            this.fullName = fullName;
    }

    abstract void directMessaging(String username, String message);


    abstract void post(Object body);
    abstract void notifications();




    @Override
    public String toString() {
        return "SocialMedia{" +
                "personalUrl='" + personalUrl + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}


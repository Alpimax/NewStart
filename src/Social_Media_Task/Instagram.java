package Social_Media_Task;

import java.time.LocalTime;
import java.util.ArrayList;

public class Instagram extends SocialMedia {
    private int numberOfFollowers;
    private int numberOfFollowings;
    private ArrayList<Picture> pictures;

    public Instagram(String username, String password) {
        super(username, password);
        this.personalUrl = "https://www.Instagram.com/" + username;
//        "Instagram.com/" + $username

    }

    @Override
    void directMessaging(String username, String message) {
        System.out.println(message + " message sent to " + username);
    }

    @Override
    void post(Object body) {

    }

    @Override
    void notifications() {
        int hours = LocalTime.now().getHour();
        if (hours >= 8 && hours <= 17)
            System.out.println("Notification");
        else
            System.out.println("Sleep mode");
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(int numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public int getNumberOfFollowings() {
        return numberOfFollowings;
    }

    public void setNumberOfFollowings(int numberOfFollowings) {
        this.numberOfFollowings = numberOfFollowings;
    }

    public ArrayList<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<Picture> pictures) {
        this.pictures = pictures;
    }
}

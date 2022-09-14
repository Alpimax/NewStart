package Social_Media_Task;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;
import java.util.ArrayList;

public class Facebook extends SocialMedia {

    private int age;
    private int numberOfFriend;
    private ArrayList<Post> posts;

    static {
        platform = "Facebook";
    }

    public Facebook(String username, String password) {
        super(username, password);
        this.personalUrl = "https://www.facebook.com/" + username;
        setPosts(new ArrayList<Post>());

    }

    public Facebook(String username, String password, String fullName) {
        super(username, password, fullName);
    }

    public Facebook(String username, String password, String fullName, int age, int numberOfFriend) {
        super(username, password, fullName);
        setAge(age);
        setNumberOfFriend(numberOfFriend);
    }

    public void setAge(int age) {
        if (age <= 0)
            this.age = 0;
        else
            this.age = age;
    }

    public void setNumberOfFriend(int numberOfFriend) {
        if (numberOfFriend <= 5000 && numberOfFriend >= 0) {
            this.numberOfFriend = numberOfFriend;
        } else
            this.numberOfFriend = 0;

    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public int getNumberOfFriend() {
        return numberOfFriend;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    @Override
    void directMessaging(String username, String message) {
        System.out.println(message + " message sent to " + username);
    }

    @Override
    void post(Object media) {

    }

    @Override
    void notifications() {
        int hours = LocalTime.now().getHour();
        if (hours >= 8 && hours <= 17)
            System.out.println("Notification");
        else
            System.out.println("Sleep mode");
    }

}


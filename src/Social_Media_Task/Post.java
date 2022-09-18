package Social_Media_Task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private String body;
    private String dateTime;

    public Post(String body) {
        this.body = body;
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a"));
    }


    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setBody(String body) {
        this.body = body;
    }

    final String getDateTime() {
        return dateTime;
    }

    public String getBody() {
        return body;
    }

}

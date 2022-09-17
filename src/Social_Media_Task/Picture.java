package Social_Media_Task;

public class Picture {
    byte[] image;
    final String extension;
    private String caption;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    final void setImage() {

    }

    final void setExtension() {

    }

    public void getImage() {
    }

    public void getExtension() {
    }

    public Picture(byte[] image, String extension, String caption) {
        this.image = image;
        this.extension = extension;
        this.caption = caption;
    }
}

package Day38_AccessModifiers;

public class TrafficLight {

    private  String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equals("Red")|| color.equals("Yellow")||color.equals("Green")) {
            this.color = color;
        }
    }
}

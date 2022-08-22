package Day38_AccessModifiers.Traffic;

public class TrafficLight {

    public TrafficLight(String color) {
        setColor(color);
    }

    private  String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equals("red")|| color.equals("yellow")||color.equals("green")) {
            this.color = color;
        }
    }
}

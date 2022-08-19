package Day38_AccessModifiers.Traffic;

public class Driving {
    public static void main(String[] args) {


    TrafficLight road1 = new TrafficLight("red");
        System.out.println(road1.getColor()); // road1. color is not valid.


        road1.setColor("blue");
        System.out.println(road1.getColor());
        road1.setColor("green");
        System.out.println(road1.getColor());

    }



}

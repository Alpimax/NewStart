package CodingBat;

public class CodingBat {
    private int age;
    private String color;
    private String cins;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }else
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.equals("yellow")) {
            this.color = color;
        }
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }




    public CodingBat(int age, String color, String cins) {
        setAge(age);
        setColor(color);
        setCins(cins);
    }



    public String toString() {
        return "Cins: " + cins + "\nAge: " + age + "\nColor: " + color;
    }
}

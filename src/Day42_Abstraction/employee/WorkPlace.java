package Day42_Abstraction.employee;

public class WorkPlace {
    public static void main(String[] args) {

        // cannot create objects of the Abstract classes
//        Person obj = new Person();
//        Employee obj2 = new Employee();

        Tester baz = new Tester("Baz", 20, "SDET", 100_000);
        System.out.println(baz);

        baz.sleep(8);
        baz.work();


    }
}

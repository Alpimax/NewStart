package day44_polymorphism.employee;

public class Scrum {

    public static void main(String[] args) {

        // Reference of super classes

        Person tester1 = new Tester("James Bond", "Secret Agent", 150_000);
        System.out.println(tester1);

        // tester1 can access the name variable

        // these are not accessible because the Person reference doesn't have to access to them
//        tester1.work();
//        tester1.create();

        Employee tester2 = new Tester("Jose Penso", "SDET", 200_000);
        System.out.println(tester2);

        // in total tester2 has access to name, jobTitle, salary, work()

        tester2.work();

        Object tester3 = new Tester("Milana Ra", "Senior Tester", 300_000);
        // tester3 doesn't have access to anything new. Nothing from Person, Employee, or Tester
        // all invalid:
//        tester3.work(0);
//        tester3.name;
//        tester3.salary;

        // reference of the interface

//        CreateSmokeTest tester4 = new Tester("Merve Ankara", "SDET", 203_000);
//        tester4.work();
//        tester4.create();

        // tester4 has access to the create() method

    }
}
package day44_polymorphism.employee;

public final class Tester extends Employee {

    public Tester(String name, String jobTitle, double salary) {
        super(name, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("running test cases");
    }

    public void writeBugReport() {
        System.out.println("Found bug, writing report");
    }
}


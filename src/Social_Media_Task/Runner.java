package Social_Media_Task;

public class Runner {
    public static void main(String[] args) {
        Facebook obj = new Facebook("alpimax","alper");
        obj.notifications();
        System.out.println(obj);
        obj.post(" Alpi king of this world!!");
        System.out.println(obj);
    }
}

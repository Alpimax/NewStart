package Day38_AccessModifiers.Flight;

public class Airport {
    public static void main(String[] args) {
        FlightTicket ticket1 = new FlightTicket("first", "Chicago", "virgina");
        System.out.println(ticket1.getType());
        System.out.println(ticket1.getDeparture());
        System.out.println(ticket1.getArrival());
        System.out.println("traffic");
        FlightTicket ticket2 = new FlightTicket("flying", "new york", "canada");
        System.out.println(ticket2.getType());
        ticket2.setType("economy");
        System.out.println(ticket2.getType());
    }
}


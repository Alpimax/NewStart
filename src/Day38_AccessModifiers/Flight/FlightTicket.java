package Day38_AccessModifiers.Flight;

public class FlightTicket {
    //   declare these instance variables:
    private String type, departure, arrival;
//

    public FlightTicket(String type, String departure, String arrival) {
        setType(type);
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type.equals("first") || type.equals("business") || type.equals("economy"))
            this.type = type;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

//         encapsulate all of them

//         create constructor to set up the object

//            Note: type should only be first, business, or economy
}

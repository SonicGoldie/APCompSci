package Projects;

public class FlightTest {

    public static void main(String[] args) {
        Flight f1 = new Flight("American", "PHL", "OGG", 1);
        f1.setFlightNumber(10);
        System.out.println(f1.toString());

        Flight f2 = new Flight("American", "OGG", "PHL", 2);
        f2.setFlightNumber(11);
        System.out.println(f2.toString());
    }
}
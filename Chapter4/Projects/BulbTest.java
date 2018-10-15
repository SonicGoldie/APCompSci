package Projects;

public class BulbTest {

    public static void main(String[] args) {
        Bulb bulb1 = new Bulb(true);
        Bulb bulb2 = new Bulb(false);
        Bulb bulb3 = new Bulb(true);
        Bulb bulb4 = new Bulb(false);

        System.out.println("Bulb1: " + bulb1.getOn());
        System.out.println("Bulb2: " + bulb2.getOn());
        System.out.println("Bulb3: " + bulb3.getOn());
        System.out.println("Bulb4: " + bulb4.getOn());
    }
}
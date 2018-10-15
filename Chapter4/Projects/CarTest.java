package Projects;

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car("Jeep", "Wrangler", 2015);
        Car c2 = new Car("Honda", "Odyssey", 2011);
        Car c3 = new Car("Ford", "Torus", 2016);
        Car c4 = new Car("Volkswagen", "Jetta", 2002);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());

        System.out.println("Is antique: " + c4.isAntique());

        c4.setYear(2003);
        System.out.println(c4.getYear());

        c4.setMake("Ford");
        System.out.println(c4.getMake());

        c4.setModel("Explorer");
        System.out.println(c4.getModel());
    }
}
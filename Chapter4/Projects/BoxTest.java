package Projects;

public class BoxTest {

    public static void main(String[] args) {
        Box b1 = new Box(10, 10, 10);
        b1.setHeight(11);
        System.out.println(b1.toString());

        Box b2 = new Box(10, 10, 10);
        b2.setWidth(11);
        System.out.println(b2.toString());

        Box b3 = new Box(10, 10, 10);
        b3.setDepth(11);
        b3.setFull(true);
        System.out.println(b3.toString());

    }
}
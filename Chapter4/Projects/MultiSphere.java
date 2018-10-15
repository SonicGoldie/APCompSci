package Projects;

public class MultiSphere {

    public static void main(String args[]) {
        Sphere s1 = new Sphere(10);
        System.out.println(s1.toString());
        s1.setDiameter(12);
        System.out.println(s1.getVolume());

        Sphere s2 = new Sphere( 20);
        System.out.println(s2.toString());
        s2.setDiameter(22);
        System.out.println(s2.getSurfaceArea());
    }
}
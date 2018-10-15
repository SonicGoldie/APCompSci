package Projects;

public class Kennel {

    public static void main(String[] args) {
        Dog d1 = new Dog(8, "Max");
        Dog d2 = new Dog(6, "Charlie");

        d1.setAge(d1.getAge() + 1);
        d2.setAge(d2.getAge() + 1);

        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }
}
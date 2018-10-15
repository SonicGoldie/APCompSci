package Projects;



public class BookTest {

    public static void main(String[] args) {
        Book b1 = new Book("Book1", "BookA", "Books Inc", 2001);
        b1.setTitle("BetterBook");
        System.out.println(b1.toString());

        Book b2 = new Book("Book2", "BookA", "Books Inc", 2001);
        b2.setAuthor("BookB");
        System.out.println(b2.toString());

        Book b3 = new Book("Book3", "BookA", "Books Inc", 2001);
        b3.setPublisher("Not a Fake Publisher");
        System.out.println(b3.toString());
    }
}
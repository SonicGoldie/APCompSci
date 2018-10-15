package Projects;

public class CounterTest {

    public static void main(String[] args) {
        Counter count1 = new Counter();
        Counter count2 = new Counter();

        count1.click();
        count1.click();
        System.out.println(count1.getCount());
        count1.reset();


        count2.click();
        count2.click();
        System.out.println(count2.getCount());
        count2.reset();
    }
}
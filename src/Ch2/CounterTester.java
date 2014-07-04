package Ch2;

/**
 * Create a main method that calls increment 5 times and then calls total.
 *
 * @author Kristine Brown
 * Head First Ch 2 Assignment
 */
public class CounterTester
{
    public static void main (String[] args)
    {
        CounterClass myClass = new CounterClass();
        myClass.increment();
        myClass.increment();
        myClass.increment();
        myClass.increment();
        myClass.increment();

        int x = myClass.total();

        System.out.println("Increment count: " + x);
    }
}

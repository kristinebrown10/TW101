package Ch2;

/**
 * Create a class that counts how many times you call the method increment()
 * and prints out that number when you call total().
 *
 * @author Kristine Brown
 * Head First Ch 2 Assignment
 */
public class CounterClass
{
    // instance variables - replace the example below with your own
    private int count;

    /**
     * Constructor for objects of class CounterClass
     */
    public CounterClass()
    {
        // initialise instance variables
        count = 0;
    }

    public void increment()
    {
        count++;
    }

    public int total()
    {
        return count;
    }
}

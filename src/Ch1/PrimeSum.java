package Ch1;

/**
 * Created by KBrown on 7/3/14.
 * Create a class that prints the sum of all odd numbers from 1 to 100
 */
public class PrimeSum {
    public static void main (String[] args) {
        int x = 1;
        int sum = 0;
        int y = 100;
        while (x <= y) {
            sum += x;
            x += 2;
        }
        System.out.println("Sum of all odds between 1 and " + y + ": " + sum);
    }
}

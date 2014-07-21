package IntroExercises;
import java.util.ArrayList;
/**
 * Write a method generate(int n) that given an integer N will return a list of integers such
 * that the numbers are the factors of N and are arranged in increasing numerical order.

 For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
 */
public class PrimeFactorsExercise {
    public void generate (int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i < n; i++) {
            if(isPrime(i) && n%i == 0) {
                list.add(i);
            }
        }
        System.out.println(list.toString());
    }

    public boolean isPrime(int n) {
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}


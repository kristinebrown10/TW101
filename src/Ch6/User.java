package Ch6;

import java.util.ArrayList;

/**
 * Created by KBrown on 7/3/14.
 */
public class User {
    private int num;
    private ArrayList<Integer> guesses = new ArrayList<Integer>();

    public int guess(int min, int max) {
        num = (int) (Math.random() * ((max - min) + 1)) + min;
        guesses.add(num);
        return num;
    }

    public String printGuesses() {
        String toPrint = "You guessed: ";
        for(int i = 0; i < guesses.size(); i++) {
            toPrint += guesses.get(i) + " ";
        }
        return toPrint;
    }

}

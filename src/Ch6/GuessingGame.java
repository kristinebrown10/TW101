package Ch6;

/**
 * Created by KBrown on 7/3/14.
 */
public class GuessingGame {
    int random;

    public void setRandomNum(int r) {
        random = r;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "high";
        if(guess == random) {
            result = "win";
        }
        else if(guess > random) {
            System.out.println("You guessed too high, try again.");
            result = "high";
        }
        else if(guess < random) {
            System.out.println("You guessed too low, try again.");
            result = "low";
        }
        return result;
    }
}

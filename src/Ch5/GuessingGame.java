package Ch5;

/**
 * Created by KBrown on 7/3/14.
 * Write a program that chooses a random number between 1 and 100.
 * Then asks the user to enter a guess. If they guess right then
 * tell them they win, otherwise tell them if they guessed too
 * high or low. Keep asking the user to guess until they get the
 * right answer. Use classes to separate the different concerns of
 * this program.
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

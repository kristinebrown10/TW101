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

    public GuessingGame() {}
    public void startGame () {
        int num = (int) (Math.random() * 99) + 1;
        int max = 99;
        int min = 1;
        System.out.println("Number to guess: " + num);
        int guess;

        User user = new User();

        while(true) {
            guess = user.guess(min,max);
            System.out.println("User guessed: " + guess);

            if(guess == num) {
                System.out.println("You win! The number was " + num);
                break;
            }
            else if(guess > num) {
                max = guess - 1;
                System.out.println("You guessed too high, try again.");
            }
            else if(guess < num) {
                min = guess + 1;
                System.out.println("You guessed too low, try again.");

            }
        }
    }
}

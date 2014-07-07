package Ch6;

/**
 * Created by KBrown on 7/3/14.
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
                System.out.println(user.printGuesses());
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

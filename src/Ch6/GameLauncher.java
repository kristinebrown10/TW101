package Ch6;
import java.util.ArrayList;
/**
 * Created by KBrown on 7/3/14.
 * Runs the game and saves all user answers and prints them out at the end of the game.
 */
public class GameLauncher {
    private GuessingGame gg = new GuessingGame();
    private GameHelper helper = new GameHelper();
    private ArrayList<String> userGuesses = new ArrayList<String>();
    private int randomNum;
    private boolean isAlive;

    private void setUpGame() {
        randomNum = (int) (Math.random() * 100);
        gg.setRandomNum(randomNum);
        isAlive = true;
    }

    private void startPlaying() {
        while(isAlive) {
            String guess = helper.getUserInput("Enter your guess");
            String result = gg.checkYourself(guess);
            userGuesses.add(guess);
            if(result.equals("win")) {
                isAlive = false;
                System.out.println("You win!");
                System.out.print("You guessed: " + userGuesses.toString());
            }
        }
    }

    public static void main (String[] args) {
        GameLauncher game = new GameLauncher();
        game.setUpGame();
        game.startPlaying();
    }
}

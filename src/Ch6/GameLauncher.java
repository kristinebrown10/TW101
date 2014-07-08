package Ch6;
import java.util.ArrayList;
/**
 * Created by KBrown on 7/3/14.
 */
public class GameLauncher {
    public static void main (String[] args) {
        GuessingGame gg = new GuessingGame();
        GameHelper helper = new GameHelper();
        int randomNum = (int) (Math.random() * 100);
        ArrayList<String> userGuesses = new ArrayList<String>();

        gg.setRandomNum(randomNum);
        boolean isAlive = true;

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
}

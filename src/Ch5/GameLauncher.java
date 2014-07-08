package Ch5;

/**
 * Created by KBrown on 7/3/14.
 */
public class GameLauncher {
    public static void main (String[] args) {
        GuessingGame gg = new GuessingGame();
        GameHelper helper = new GameHelper();
        int randomNum = (int) (Math.random() * 100);

        gg.setRandomNum(randomNum);
        boolean isAlive = true;

        while(isAlive) {
            String guess = helper.getUserInput("Enter your guess");
            String result = gg.checkYourself(guess);
            if(result.equals("win")) {
                isAlive = false;
                System.out.println("You win!");
            }
        }
    }
}

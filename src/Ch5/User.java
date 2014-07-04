package Ch5;

/**
 * Created by KBrown on 7/3/14.
 */
public class User {
    private int num;

    public int guess(int min, int max) {
        num = (int) (Math.random() * ((max - min) + 1)) + min;
        return num;
    }
}

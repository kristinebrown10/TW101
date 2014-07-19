package Ch5;
import java.io.*;
/**
 * Created by KBrown on 7/7/14.  Taken from HeadFirst, Ch 5, Page 112.
 * Gets user input. Ready-bake code.
 */
public class GameHelper {

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader (new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        }
        catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }

}

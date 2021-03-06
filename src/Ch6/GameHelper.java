package Ch6;

import java.io.*;

/**
 * Created by KBrown on 7/7/14.
 * Ready back code to get user input
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

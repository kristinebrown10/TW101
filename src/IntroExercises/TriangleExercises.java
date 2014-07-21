package IntroExercises;

/**
 * Easiest exercise ever
 Print one asterisk to the console.
 Example:
 *

 Draw a horizontal line
 Given a number n, print n asterisks on one line.
 Example when n=8:
 ********

 Draw a vertical line
 Given a number n, print n lines, each with one asterisks
 Example when n=3:
 *
 *
 *

 Draw a right triangle
 Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
 Example when n=3:
 *
 **
 ***
 */
public class TriangleExercises {
    public void oneAsterisk(){
        System.out.println("*");
    }

    public void horizontalLine(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }

    public void verticalLine(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void rightTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            int x = 0;
            while (x < i) {
                System.out.print("*");
                x++;
            }
            System.out.println();
        }
    }
}

package IntroExercises;

/**
 * Isosceles Triangle
 Given a number n, print a centered triangle. Example for n=3:
   *
  ***
 *****


 Diamond
 Given a number n, print a centered diamond. Example for n=3:

   *
  ***
 *****
  ***
   *



 Diamond with Name
 Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:

 *
 ***
 Bill
 ***
 *
 */
public class DiamondExercises {
    public void isoscelesTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            int x = i;
            while (x < n) {
                System.out.print(" ");
                x++;
            }
            x = 0;
            int y = 2*i - 1;
            while (x < y) {
                System.out.print("*");
                x++;
            }
            System.out.println();
        }
    }

    public void bottomTriangle(int n) {
        for(int i = n-1; i > 0; i--) {
            int x = i;
            while (x < n) {
                System.out.print(" ");
                x++;
            }
            x = 0;
            int y = 2*i - 1;
            while (x < y) {
                System.out.print("*");
                x++;
            }
            System.out.println();
        }
    }

    public void diamond (int n) {
        isoscelesTriangle(n);
        bottomTriangle(n);
    }

    public void diamondWithName(int n) {
        for(int i = 1; i < n; i++) {
            int x = i;
            while (x < n) {
                System.out.print(" ");
                x++;
            }
            x = 0;
            int y = 2*i - 1;
            while (x < y) {
                System.out.print("*");
                x++;
            }
            System.out.println();
        }
        System.out.println("Kristine");
        bottomTriangle(n);
    }
}

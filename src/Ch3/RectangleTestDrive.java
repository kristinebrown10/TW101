package Ch3;


/**
 * Create an array of 5 Rectangles (each with height and width instance variables and an area() method).
 * Find the average area of the rectangles.
 *
 * @author Kristine Brown
 * HeadFirst Ch 3 Assignment
 */
public class RectangleTestDrive
{
    public static void main (String[] args) {
        Rectangle[] rectangles = new Rectangle[5];

        rectangles[0] = new Rectangle();
        rectangles[0].height = 5;
        rectangles[0].width = 4;
        rectangles[1] = new Rectangle();
        rectangles[1].height = 3;
        rectangles[1].width = 3;
        rectangles[2] = new Rectangle();
        rectangles[2].height = 9;
        rectangles[2].width = 1;
        rectangles[3] = new Rectangle();
        rectangles[3].height = 6;
        rectangles[3].width = 3;
        rectangles[4] = new Rectangle();
        rectangles[4].height = 7;
        rectangles[4].width = 8;
        double avg = 0;
        for(int i = 0; i < rectangles.length; i++) {
            avg += rectangles[i].area();
        }
        avg = avg/rectangles.length;

        System.out.println("Average area: " + avg);
    }
}


package Ch4;

/**
 * Create a new version of the Chapter 3 exercise where you pass the height and
 * width into the Rectangle constructor and initialize the instance variables there.
 * Add a perimeter() method to Rectangle. Print the total area of all rectangles.
 * Print the total perimeter of all rectangles.
 *
 * @author Kristine Brown
 * HeadFirst Ch 4 Assignment
 */
public class RectangleTestDrive
{
    public static void main (String[] args) {
        Rectangle[] rectangles = new Rectangle[5];

        rectangles[0] = new Rectangle(5,4);
        rectangles[1] = new Rectangle(3,3);
        rectangles[2] = new Rectangle(8,7);
        rectangles[3] = new Rectangle(9,1);
        rectangles[4] = new Rectangle(6,3);
        int area = 0;
        int perimeter = 0;
        for(int i = 0; i < rectangles.length; i++) {
            area += rectangles[i].area();
            perimeter += rectangles[i].perimeter();
        }

        System.out.println("Total area: " + area);
        System.out.println("Total perimeter: " + perimeter);
    }
}
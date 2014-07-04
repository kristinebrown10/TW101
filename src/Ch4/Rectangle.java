package Ch4;

/**
 * Rectangle class
 *
 * @author Kristine Brown
 * Head First Ch 4 Assignment
 */
public class Rectangle
{
    private int height;
    private int width;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(int h, int w)
    {
        height = h;
        width = w;
    }

    public int area()
    {
        return width * height;
    }

    public int perimeter()
    {
        return (2*height + 2*width);
    }
}


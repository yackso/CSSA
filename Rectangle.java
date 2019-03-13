
/**
 * Just a Rectangle I guess
 *
 * @author Jackson Ellison
 * @version 1/30/19
 */
public class Rectangle
{
    private int length;
    private int width;
    public Rectangle(int initialLength, int initialWidth)
    {
         width = initialWidth;
         length = initialLength;
    }
    public String toString()
    {
        return (length + " x " + width);
    }
    public int getArea()
    {
        return length * width;
    }
    public int  getPerimeter()
    {
        return(length*2 + width*2);
    }
    public boolean isSquare()
    {
        return (length == width);
    }
    public void doubleSides()
    {
        length = length * 2;
        width = width * 2;
    }
    public void changeLength(int newLength)
    {
        length = newLength;
    }
    public void changeWidth(int newWidth)
    {
        width = newWidth;
    }
    public int diffrenceInArea(Rectangle rect)
    {
        return (getArea() - rect.getArea());
    }
}

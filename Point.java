
/**
 * a point class for exploring objects
 *
 * @author Jackson Ellison
 * @version 1/29/19
 */
public class Point
{
    private int x;
    private int y;
    
    public Point(int initialX, int initialY)
    {
         x = initialX;
         y = initialY;
         
    }
    
    public Point()
    {
        x = 0;
        y = 0;
    }
    
    public void translate(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    
    public void setLocation(int x1, int y1)
    {
        x = x1;
        y = y1;
    }
    
    public double distanceToOrigin()
    {
        return Math.sqrt(x * x + y * y);
    } 
    
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
    
}

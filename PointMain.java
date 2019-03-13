
/**
 * a space to test point class
 *
 * @author Jackson Ellison
 * @version 1/29/19
 */
public class PointMain
{
    public static void main(String[]args)
    {
        Point p1 = new Point(3,8);
        
        System.out.println(p1);
        
        p1.translate(-1,3);
        System.out.println(p1);
        p1.setLocation(4,9);
        System.out.println(p1);
        System.out.println(p1.distanceToOrigin());
    }
}

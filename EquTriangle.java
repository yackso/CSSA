
/**
 * Write a description of class EquilateralTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EquTriangle extends RegularPolygon
{
    public EquTriangle(int sideLength)
    {
        super("Triangle", 3, sideLength);
    }
    public double getArea()
    {
        return Math.sqrt(3)/4 * getSideLength() * getSideLength();
    }
}

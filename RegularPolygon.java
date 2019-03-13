
/**
 * Write a description of class RegularPolygon here.
 *
 * @author Jackson Ellison
 * @version 3/5/19
 */
public abstract class RegularPolygon
{
    private String name;
    private int numSides, sideLength;
    public RegularPolygon(String name, int numSides, int sideLength)
    {
        this.name = name;
        this.numSides = numSides;
        this.sideLength = sideLength;
    }
    public String hey()
    {
        return ("hello");
    }
    public int getPerimeter()
    {
        return numSides * sideLength;
    }
    public String toSting()
    {
        return name + " -- Perimeter:" + getPerimeter();
    }
    public int getNumsSides() {return numSides;}
    public int getSideLength(){return sideLength;}
    
    public abstract double getArea();
}
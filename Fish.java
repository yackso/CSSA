
/**
 * Just an aquarium
 *
 * @author Jackson Ellison
 * @version 2/28/19
 */
public class Fish extends Animal
{
    private int gillSize;
    private String enviroment;
    public Fish(boolean _isDomesticated,int _stinkLevel, String _color, int _gillSize, String _enviroment)
    {
        super(_isDomesticated,_stinkLevel ,0,_color);
        gillSize = _gillSize;
        enviroment = _enviroment;
    }
    public void layEggs(int num)
    {
        System.out.println("I layed " + num + " eggs.");
    }
    public void school()
    {
        System.out.println("Im swimming with other fish");
    }
    public void locomote(int num)
    {
        System.out.println("I swam " + num + " spaces");
    }
}

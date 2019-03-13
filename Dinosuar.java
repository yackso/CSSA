
/**
 * Write a description of class Dinosuar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dinosuar extends Animal
{
    private int size;
    private boolean haveFeathers;
    public Dinosuar(boolean _isDomesticated,int _stinkLevel, int _numLegs, String _color, int _size,boolean _haveFeathers)
    {
        super(_isDomesticated,_stinkLevel ,_numLegs,_color);
        size = _size;
        haveFeathers = _haveFeathers;
    }
    public void roar()
    {
        System.out.println("ROOOAAARRRR");
    }
    public void becomeOil()
    {
        System.out.println("many years later...(car sound)");
    }
}

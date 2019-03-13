
/**
 * Write a description of class Animal here.
 *
 * @author Jackson Ellison
 * @version 2/27/19
 */
public class Animal
{
   private boolean isDomesticated;
   private int stinkLevel,numLegs;
   private String color;
   
   public Animal(boolean _isDomesticated,int _stinkLevel, int _numLegs, String _color)
   {
       isDomesticated = _isDomesticated;
       stinkLevel = _stinkLevel;
       numLegs = _numLegs;
       color = _color;
   }
   
   public void respirate()
   {
       System.out.println("I am respirating");
   }
   
   public void locomote(int num)
   {
       stinkLevel += (num / 0.25);
       System.out.println("I locomoted " + num + " spaces. my stink level is now " + stinkLevel);
   }
   
   public void bathe()
   {
       stinkLevel--;
       if (stinkLevel < 0)
            stinkLevel = 0;
       System.out.println("I have bathed, my stink level is now "+ stinkLevel);
   }
}

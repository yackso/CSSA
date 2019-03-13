
/**
 * like a zoo but not
 *
 * @author Jackson Ellison
 * @version 2/27/19
 */
public class AnimalMain
{
    public static void main (String [] args)
    {
        Animal a  = new Animal(false,3,4,"green");
        a.respirate();
        a.locomote(8);
        a.bathe();
        
        System.out.println();
        
        Fish b = new Fish(false, 200, "blue",12,"deep ocean");
        b.respirate();
        b.locomote(18);
        b.bathe();
        b.layEggs(20000000);
        
        System.out.println();
        
        Dinosuar CoolEthan = new Dinosuar(false,3,2,"green",100,true);
    }
}

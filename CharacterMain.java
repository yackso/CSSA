
/**
 * Write a description of class CharacterMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CharacterMain
{
    public static void main(String [] args)
    {
        Character ethanRLord = new Character("Ethan R Lord", "god", 5, 1000000, 1000,-5000);
        ethanRLord.getName();
        ethanRLord.enterCombat(50);
        ethanRLord.rest(100);
        ethanRLord.socialize(2);
        ethanRLord.getHealth();
        ethanRLord.getMoney();
        Character alsoEthan = new Character("ethan", "sophmore", 4, 10, 10000,5000);
        interview int1 = new interview(ethanRLord,alsoEthan);
        int1.compareTraits();
    }
}


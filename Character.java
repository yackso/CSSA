
/**
 * just some characters
 *
 * @author Jackson Ellison
 * @version 2/6/19
 */
public class Character
{
    private String name;
    private String species;
    private int age, health, wisdom, charisma, money; 
    public Character (String name, String species, int age, int health, int wisdom,int money)
    {
        this.name = name;
        this.age = age;
        this.species = species;
        this.wisdom = wisdom;
        this.health = health;
        this.money = money;
    }
    public String toString()
    {
        return( name + ", " + species + ", " + age + ", " + health + ", " + wisdom + ", " + money);
    }
    public void enterCombat(int enemies)
    {
        health = health -(enemies * 5);
        money += enemies * 10;
        charisma = charisma - 10;
    }
    public void rest(int hours)
    {
        health += hours;
    }
    public void socialize(int amountOfPeople)
    { 
      if (amountOfPeople == 1){
                System.out.println("was good");
                charisma = charisma + 10;
            }
      if (amountOfPeople == 2){      
                System.out.println("Hello fellow gamers");
                charisma = charisma + 20;
            }
      if (amountOfPeople == 3){      
                System.out.println("(gulp)hello people");
                charisma = charisma + 30;
            }
      if (amountOfPeople >3){      
                System.out.println("GOODBYE!!!!!");
                charisma = charisma - 30;
            }
    }
    public void shop()
    {
        money -= 10;
    }
    
    public void printHealth()
    {
        System.out.println("health:" + health);
    }
    public void printMoney()
    {
        System.out.println("money:" + money);
    }
    public void printName()
    {
        System.out.println("name:" + name);
    }
    //accessor methods
    public int getWis()
    {
        return wisdom;
    }
    public int getChar()
    {
        return charisma;
    }
    public String getName()
    {
        return name;
    }
    public String getSpecies()
    {
        return species;
    }
    public int getmoney()
    {
        return money;
    }
    public int getAge()
    {
        return age;
    }
    //setter methods
    
}

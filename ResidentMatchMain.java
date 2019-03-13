
/**
 * Write a description of class ResidentMatchMain here.
 *
 * @author Jackson Ellison, Ethan Lord
 * @version 2/13/19
 */
public class ResidentMatchMain
{
    public static void main(String [] args)
    {
        int [] nums = new int[100];
        int [] nums2 = {4, 6, 7};
        int min = 1;
        int max = 100;
        Resident [] residents = new Resident[100];
        double [][] stats = new double[100][99];
        for (int i = 0; i < 100; i++)
        {
            residents[i] = new Resident(i + 1, (int)(Math.random() * (max - min + 1) + min),(int)(Math.random() * (max - min + 1) + min),(int)(Math.random() * (max - min + 1) + min));
        }
        for (int i = 0; i < 100; i++)
        {
            for (int j = i + 1; j < 100; j++)
            {
                stats[i][j] = calculateCompScore(residents[i], residents[j]);
            }
        }
    }
    public static void printArray(Resident [] arr)
    {
        for (Resident r: arr)
        {
            System.out.println(r);
        }
    }
    public static double calculateCompScore(Resident r1, Resident r2)
    {
        return (Math.abs(r1.getSleep() - r2.getSleep()) + Math.abs(r1.getSocial() - r2.getSocial()) + Math.abs(r1.getStudy() - r2.getStudy()))/3;
    }
    
}

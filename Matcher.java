
/**
 * Write a description of class matcher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matcher
{
    private Resident [] group; 
    public Matcher(Resident [] group)
    {
        this.group = group;
    }
    public static double calculateCompScore(Resident r1, Resident r2)
    {
        return (Math.abs(r1.getSleep() - r2.getSleep()) + Math.abs(r1.getSocial() - r2.getSocial()) + Math.abs(r1.getStudy() - r2.getStudy()))/3;
    }
    public Resident [] bestMatch(Resident [] group)
    {
        Resident [] best = {group[0], group[1]};
        for (int i = 0; i < group.length;i ++)
        {
            for (int j = i + 1; j < group.length; j++)
            {
                if (calculateCompScore(group[i],group[j]) > calculateCompScore(best[0],best[1]))
                {
                    best[0] = group[i];
                    best[1] = group[j];
                }
            }
        }
        System.out.println("The best matched partners are the following with a compatibility score of " + calculateCompScore(best[0],best[1]) + ":");
        System.out.println(best[0]);
        System.out.println(best[1]);
        return best;
    }
    public Resident [] worstMatch(Resident [] group)
    {
        Resident [] worst = {group[0], group[1]};
        for (int i = 0; i < group.length;i ++)
        {
            for (int j = i + 1; j < group.length; j++)
            {
                if (calculateCompScore(group[i],group[j]) < calculateCompScore(worst[0],worst[1]))
                {
                    worst[0] = group[i];
                    worst[1] = group[j];
                }
            }
        }
        System.out.println("The worst matched partners are the following with a compatibility score of " + calculateCompScore(worst[0],worst[1]) + ":");
        System.out.println(worst[0]);
        System.out.println(worst[1]);
        return worst;
    }
    public Resident bestIndividualMatch(Resident matched)
    {
        Resident bestMatched = group[0];
        int resId = matched.getId() - 1;
        double bestCompScore = 0;
        int bestResId = 0;
        for (int i = 0; i < group.length; i++)
        {
            if (resId != i)
            {
                if (bestCompScore < calculateCompScore(group[resId], group[i]))
                {
                    bestCompScore = calculateCompScore(group[resId], group[i]);
                    i = bestResId;
                }
            }
        }
        return group[bestResId];
    }
    public Resident worstIndividualMatch(Resident matched)
    {
        Resident worstMatched = group[0];
        int resId = matched.getId() - 1;
        double worstCompScore = 101;
        int worstResId = 0;
        for (int i = 0; i < group.length; i++)
        {
            if (resId != i)
            {
                if (worstCompScore > calculateCompScore(group[resId], group[i]))
                {
                    worstCompScore = calculateCompScore(group[resId], group[i]);
                    i = worstResId;
                }
            }
        }
        return group[worstResId];
    }
}


/**
 * Write a description of class Resident here.
 *
 * @author Jackson Ellison, Ethan Lord
 * @version 2/13/19
 */
public class Resident
{
    private int residentNum, sleepHabits, studyHabits, socialActivity;
    public Resident(int id, int sl, int st, int sc)
    {
        residentNum = id;
        sleepHabits = sl;
        studyHabits = st;
        socialActivity = sc;
    }
    public String toString()
    {
        return("Resident #" + residentNum + "\n\tSleepHabits: " + sleepHabits + "\n\tStudyHabits: " + studyHabits + "\n\tSocialHabits " + socialActivity);
    }
    public int getId()
    {
        return residentNum;
    }
    public int getSleep()
    {
        return sleepHabits;
    }
    public int getStudy()
    {
        return studyHabits;
    }
    public int getSocial()
    {
        return socialActivity;
    }
}

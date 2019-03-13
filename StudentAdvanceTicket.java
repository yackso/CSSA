
/**
 * a sub class of Tickst
 *
 * @author Jackson Ellison Rhys Plassmann
 * @version 3/8/19
 */
public class StudentAdvanceTicket extends Ticket
{
    private int numDaysBefore;
    public StudentAdvanceTicket(int ticketNum,int _numDaysBefore)
    {
        super(ticketNum);
        numDaysBefore = _numDaysBefore;
    }
    public int getPrice()
    {
        if (numDaysBefore >= 10)
            return 15;
        else
            return 20;    
    }
    public String toString()
    {
        return super.toString() + " (ID Required)";
    }
}


/**
 * A sub class of Ticket
 *
 * @author Jackson Ellison Rhys Plassmann
 * @version 3/8/19
 */
public class AdTicket extends Ticket
{
    private int daysBefore;
    public AdTicket(int ticketNum,int _daysBefore)
    {
        super(ticketNum);
        daysBefore = _daysBefore;
    }
    public int getPrice()
    {
        if (daysBefore >= 10)
            return 30;
        else
            return 40;    
    }
}

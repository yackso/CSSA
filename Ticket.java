
/**
 * the super class for all types of tickets
 *
 * @author Jackson Ellison, Rhsy PLassmann
 * @version 3/8/19
 */
public abstract class Ticket
{
    private int ticketNum;
    public abstract int getPrice();
    public Ticket(int _ticketNum)
    {
        ticketNum = _ticketNum;
    }
    public String toString()
    {
        return ("ticket num is " + ticketNum + ". The price is:$" + getPrice());
    }
    
}

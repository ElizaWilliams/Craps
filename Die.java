
/**
 * Makes a die that rolls randomly
 *
 * @author Eliza Williams
 * @version 2021-02-02
 */
public class Die
{
    // instance variables 
    private int number;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        number = 0;
    }

    /**
     * Rolls number between 1 and 6
     *
     * @return    roll  the random roll
     */
    public int roll()
    {
        return (int) (Math.random()*6 + 1);
    }
}

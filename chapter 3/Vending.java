

/**
 * Write a description of class Vending here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vending
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name = "iVending iMachine";
    private final int MAX = 100;
    private int inside = 0;
    private int takeout = 0;
    /**
     * Default constructor for objects of class Vending
     */
    public Vending()
    {
        inside = 0;
        takeout = 0;
    }


    public void fillup(int num)
    {
        int number = 0;
        if (num >= 0)
        {
            number += num + inside;
            if (number <= 100)
            {
                inside += number;
            }
            else
            {
                System.out.println("The max capacity of this iVending iMachine is 100, but don't worry iVending iMachine already took what it needs!");
                inside += 100 - num;
            }
        }
        else
        {
            System.out.println("Putting a negative number means take out, but you can't take the soda without paying money. so try again with a positive number!");
        }
    }
    public void insertToken(int takes)
    {
        int numtake = 0;
        numtake = takes;
        if (numtake >= 0)
        {
            if (numtake == 0)
            {
             
            }
            else
            {
                
            }
        }
        
        
        
        
        
    }
}



/**
 * Write a description of class Vending here.
 * This class is vending machine, capacity of machine is 100, can let user takeout cans and insert cans
 * @author (Heng Li) 
 * @version (9/21/2015)
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
            if (inside == MAX)
            {
                System.out.println("This Vending Machine is already full filled");
                this.errorsfill();
            }
            else
            {
                if (number <= MAX)
                {
                    inside = number;
                }
                else
                {
                    System.out.println("The max capacity of this iVending iMachine is 100, but don't worry iVending iMachine already took what it needs!");
                    inside = MAX;
            
                }
            }
        }
        else
        {
            System.out.println("Putting a negative number means take out, but you can't take the soda without paying money. so try again with a positive number!");
            this.errorsfill();
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
                System.out.println("Really? ZERO???");
                this.errorsout();
            }
            else
            {
                if (numtake <= inside)
                {
                    inside -= numtake;
                }
                else
                {
                    System.out.println("you can't take more than I have");
                }
            }
        }
        else
        {
            System.out.println("You can't have a negative number");
            this.errorsout();
        }
        
    }
    public int getinside()
    {
        return inside;
    }
  public void errorsfill()
  {
      this.fillup();
  }
  public void errorsout()
  {
      this.insertToken();
    }
}

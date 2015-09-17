

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** description of instance variable x (add comment for each instance variable) */
    private String name = new String("iDoor");
    private boolean opener = false;
    private String state = "closed";
    private int length = 10;
    private int width = 1;
    private int height = 30;
        
    /**
     * Default constructor for objects of class Door
     */
    public Door()
    {
       this.name = "iDoor";
       this.opener = false;
       this.length = 10;
       this.width = 1;
       this.height = 30;
    }
    public void setState(String setopen)
    {
       if (setopen == "open")
       {
           opener = true;
        }
       if (setopen == "close")
       {
           opener = false;
        }
        if (opener == false)
       {
           state = "closed";
        }
        
       else
       {
           state = "open";
        }
    }
    public String getName()
    {
        return this.name;
    }
    
    public String setName(String newName)
    {
        this.name = newName;
        return this.name;
    }


}


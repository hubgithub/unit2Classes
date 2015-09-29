public class Annuity
{
    /** description of instance variable x (add comment for each instance variable) */

    /**
     * Default constructor for objects of class Annuity
     */
    public static void main (String[] args)
    {
       double pmt = 10000;
       double inter = 0.08;
       double time = 20;

       double ann;
       ann = Math.pow(1 + inter,time - 1);
       ann -= 1;
       ann /= inter;
       ann /= Math.pow(1 + inter, time -1);
       ann += 1;
       ann *= pmt;
       
       System.out.println(ann);

    }


}

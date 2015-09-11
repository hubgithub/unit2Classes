

/**
 * The class car hs a certain fule efficiency and certain amount of fuel in the 
 * gas tank. A Car may be driven a specified disatnce with reduces the amount of
 * gas in tank
   * @author (Heng) 
 * @version (9-10-2015)
 */
public class Car
{
    /** specifies the fuel efficiency of the car units of miles per gallon (mpg) */
    private double fueEfficiency;

    /**
     * Default constructor for objects of class car
    private double fuelEfficiency;
    /** specifies the amount of fuel in the gas tank in unites of gallons*/
    private double fuelInTank;
    /**
     * constructor for objects of class Car that specifies the fuel efficiency of 
     * the car.
     */
    public Car( double fuelEfficiency)
    {
        fuelInTank = 0.0;
        fueEfficiency = fuelEfficiency;
        
        // initialise instance variables
    }

    /**
     * Simulates driving the car the specified distance in miles and reduces the
     *  amount of fuel in the car's tank.
     *
     * @pre        the specified distance cannot consume for more than the fuel acailable
     *                  in the tank
     *            (what the method assumes about the method's parameters and class's state)
     * @param    distance    the specified distance to drive in miles
     */
    public void drive(double distance)
    {
        fuelInTank -= distance / fueEfficiency;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @return  the number of gallons of gas in the car's tank
     */
    public double getGasInTank()
    {
        // put your code here
        return fuelInTank;
    }
    
    /**
     * Increments the fuel stored in the car's tank by the specified amount in gallons.
     *
     * @pre     gallonsOfGas must be positive
     * @param   gallonsOfGas    amount in gallons to increment the fuel in the car's tank 
     * @return  description of the return value
     */
    public void addgas(double gallonsOfGas)
    {
        fuelInTank += gallonsOfGas;
    }

}

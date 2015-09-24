

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingTest
     */
    public VendingTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testputin()
    {
        Vending vend = new Vending();
        vend.fillup(50);
        assertEquals(50,vend.getinside());

    }
    
    @Test
    public void testout()
    {
        Vending vend = new Vending();
        vend.fillup(100);
        vend.insertToken(60);
        assertEquals(40,vend.getinside());

    }
}

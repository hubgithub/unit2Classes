
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Rectangle;

public class Backg
{
    // instance variables - replace the example below with your own
    private int xpos;
    private int ypos;
    private int bwide;
    private int bheight;
    
    private int gxpos;
    private int gypos;
    private int gwide;
    private int gheight;

    /**
     * Constructor for objects of class Backg
     */
    public Backg()
    {
        xpos = 0;
        ypos = 0;
        bwide = 1100;
        bheight = 795;
        
        
        gxpos = 0;
        gypos = 795;
        gwide = 1100;
        gheight = 205;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle sky = new Rectangle(xpos,ypos,bwide,bheight);
        g2.setColor(Color.blue);
        g2.draw(sky);
        g2.fill(sky);
        
        Rectangle grass = new Rectangle(gxpos,gypos,gwide,gheight);
        g2.setColor(Color.green);
        g2.draw(grass);
        g2.fill(grass);
    }
}

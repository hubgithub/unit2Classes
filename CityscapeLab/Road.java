import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Rectangle;

public class Road
{
    private int xpos;
    private int ypos;
    private int wide;
    private int length;

    /**
     * Constructor for objects of class Road
     */
    public Road(int x, int y, int wi, int len)
    {
        xpos = x;
        ypos = y;
        wide = wi;
        length = len;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle road = new Rectangle(xpos,ypos,wide,length);
        
        g2.setColor(Color.black);
        g2.draw(road);
        g2.fill(road);
        
    }
}

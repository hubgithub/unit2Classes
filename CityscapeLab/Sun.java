import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Point2D;
public class Sun
{
    // instance variables - replace the example below with your own
    private int xpos;
    private int ypos;
    private int radius;
    static private int num;

    /**
     * Constructor for objects of class Sun
     */
    public Sun(int x, int y, int ra)
    {
        xpos = x;
        ypos = y;
        radius = ra;
        num = 0;
    }
    public void update(int n)
    {

        num = n;
            
        if (num< 30)
        {
            xpos -= 18;
            ypos -= 7;

        }
        else
        {
            xpos -= 18;
            ypos += 7;

        }
        }
    public void draw(Graphics2D g2)
    {
        Ellipse2D sun = new Ellipse2D.Double(xpos,ypos,radius,radius);
        
        g2.setColor(Color.yellow);
        g2.draw(sun);
        g2.fill(sun);
        
    }
    
    public int getxpos()
    {
        return xpos;
    }
    public int getypos()
    {
        return ypos;
    }
}


    

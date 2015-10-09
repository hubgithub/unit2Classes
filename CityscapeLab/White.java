import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Rectangle;

public class White
{
    private int xpos;
    private int xpos2;
    private int xpos3;
    private int xpos4;
    private int xpos5;
    private int xpos6;
    
    private final int YP;
    private int height;
    private int length;
    /**
     * Constructor for objects of class White
     */
    public White()
    {
        xpos = 80;
        xpos2 = 280;
        xpos3 = 480;
        xpos4 = 680;
        xpos5 = 880;
        xpos6 = 1080;
        
        
        YP = 830;
        height = 5;
        length = 120;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        
        g2.setColor(Color.WHITE);
        if (xpos > 1080)
        {
            xpos = 80;
        }
        
        if (xpos2 > 1080)
        {
            xpos2 = 80;
        }
        
        if (xpos3 > 1080)
        {
            xpos3 = 80;
        }
        
        if (xpos4 > 1080)
        {
            xpos4 = 80;
        }
        
        if (xpos5 > 1080)
        {
            xpos5 = 80;
        }
        
        if (xpos6 > 1080)
        {
            xpos6 = 80;
        }
        Rectangle white = new Rectangle(xpos,YP,length,height);
        g2.draw(white);
        g2.fill(white);
        
        
        Rectangle white2 = new Rectangle(xpos2,YP,length,height);
        g2.draw(white2);
        g2.fill(white2);
        
        
        Rectangle white3 = new Rectangle(xpos3,YP,length,height);
        g2.draw(white3);
        g2.fill(white3);
        
        
        Rectangle white4 = new Rectangle(xpos4,YP,length ,height);
        g2.draw(white4);
        g2.fill(white4);
        
        Rectangle white5 = new Rectangle(xpos5,YP,length,height);
        g2.draw(white5);
        g2.fill(white5);
        
        Rectangle white6 = new Rectangle(xpos6,YP,length,height);
        g2.draw(white6);
        g2.fill(white6);
        
        xpos += 55;
        xpos2 += 55;
        xpos3 += 55;
        xpos4 += 55;
        xpos5 += 55;
        xpos6 += 55;
        }
        
        
    }


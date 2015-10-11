import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.Random;
public class Cloud
{
    // instance variables - replace the example below with your own
    private int xpos;
    private int ypos;
    private int ra;
    private int weather;

    /**
     * Constructor for objects of class Cloud
     */
    public Cloud(int weat)
    {
        // initialise instance variables
        weather = weat;
        ra = 30;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        // put your code here

       int num = 0;
       Random rand = new Random();
       int numx;
       int numy;
       while (num < weather)
       {
           num += 1;
           numx = rand.nextInt(1080);
           numy = rand.nextInt(350);
           xpos = numx;
           ypos = numy;
           
           Ellipse2D cloud = new Ellipse2D.Double(xpos,ypos,ra,ra);
           g2.setColor(Color.white);
           g2.draw(cloud);
           g2.fill(cloud);
           
           Ellipse2D cloud2 = new Ellipse2D.Double(xpos + 15,ypos - 15,ra,ra);
           g2.setColor(Color.white);
           g2.draw(cloud2);
           g2.fill(cloud2);
           
           Ellipse2D cloud3 = new Ellipse2D.Double(xpos + 15,ypos,ra,ra);
           g2.setColor(Color.white);
           g2.draw(cloud3);
           g2.fill(cloud3);
           
           Ellipse2D cloud4 = new Ellipse2D.Double(xpos + 30 ,ypos,ra,ra);
           g2.setColor(Color.white);
           g2.draw(cloud4);
           g2.fill(cloud4);
        }
        
        }
    }


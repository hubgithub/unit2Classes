import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Rectangle;


public class Building
{
    private int xpos;
    private int ypos;
    private int numfloor;
    private final int FLPX = 30;
    private final int BWIDE = 80;


    public Building(int x, int y, int num)
    {
        xpos = x;
        ypos = y;
        
        numfloor = num;
    }


    public void draw(Graphics2D g2)
    {
        int height = numfloor * FLPX;
        
        Rectangle rect = new Rectangle(xpos,ypos,BWIDE,height);
        
        g2.setColor(Color.BLUE);
        g2.draw(rect);
        g2.fill(rect);


    }

}

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
    private final int FLPX = 10;

    private int bwide;


    public Building(int x, int y, int num, int wide)
    {
        xpos = x;
        ypos = y;
        bwide = wide;



        numfloor = num;
    }


    public void draw(Graphics2D g2)
    {
        int height = numfloor * FLPX;

        Rectangle rect = new Rectangle(xpos,ypos,bwide,height);

        
        g2.setColor(Color.gray);
        g2.draw(rect);
        g2.fill(rect);
        
        


    }


}

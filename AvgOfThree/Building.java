import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Rectangle;

/**
 * Write a description of class Cityscape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    private int xpos;
    private int ypos;
    private int numfloor;
    private final int FLPX = 30;
    private final int WIPX = 20;
    private final int BWIDE = 40;
    private final int WIN = 10;

    public Building(int x, int y, int num)
    {
        xpos = x;
        ypos = y;
        
        numfloor = num;
    }


    public void draw(Graphics2D g2)
    {
        int top = numfloor * FLPX;
        
        Rectangle rect = new Rectangle(xpos,ypos);
        
        

    }

}
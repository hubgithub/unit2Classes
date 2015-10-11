import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Scanner;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int weather;
    
    public CityscapeComponent(int weat)
    {
        weather = weat;
        
    }
    
    
    private int sunx = 1050;
    private int suny = 200;
    Backg backg = new Backg();
    Building building = new Building(190,500,30,80);
    Building building2 = new Building(280,400,40,100);
    Building building3 = new Building(420,300,50,80);
    Building building4 = new Building(530,600,20,100);
    Building building5 = new Building(680,340,46,95);
    Building building6 = new Building(820,400,40,130);
    Sun sun = new Sun(sunx,suny,100);
    
    Road road = new Road(0,805,1100,60);
    White white = new White();

    
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    Cloud cloud = new Cloud(weather);
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        backg.draw(g2);
        building.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        building4.draw(g2);
        building5.draw(g2);
        building6.draw(g2);
        
        sun.draw(g2);
        road.draw(g2);
        white.draw(g2);
        cloud.draw(g2);

        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated0
        // ...
        int num = 0;
        while (num <= 100)
        {
            num += 1;
            
            if (num< 50)
            {
                sunx -= 10;
                suny += 4;
                sun.update(sunx,suny);
                repaint();
            }
            else
            {
                sunx -= 10;
                suny -= 4;
                sun.update(sunx,suny);
                repaint();
            }
        }
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}

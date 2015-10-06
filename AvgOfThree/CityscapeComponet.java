import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class CityscapeComponet extends JComponent
{

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Building building = new Building(300,400,30);
        
        building.draw(g2);
    }

}

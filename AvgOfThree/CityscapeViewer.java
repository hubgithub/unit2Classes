import javax.swing.JFrame;
public class CityscapeViewer
{



    public CityscapeViewer()
    {
        JFrame frame = new JFrame();
        
        frame.setSize(800,800);
        frame.setTitle("City");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        CityscapeComponet componet = new CityscapeComponet();
        
        frame.add(componet);
        
        frame.setVisible(true);
    }



}

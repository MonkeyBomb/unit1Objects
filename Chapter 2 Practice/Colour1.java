import java.awt.Color;
import javax.swing.JFrame;

public class Colour1
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        Color myColour = new Color(255,0,0);
        Color myColour2 = new Color(0,255,0);
        Color myColour3 = new Color(0,0,255);
        Color myColour4 = new Color(255,255,0);
        frame.getContentPane().setBackground(myColour);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        int go = 1;
        for (;go > 0;)
        {
            frame.setSize(300, 400);
            frame.getContentPane().setBackground(myColour);
            frame.getContentPane().setBackground(myColour2);
            frame.getContentPane().setBackground(myColour3);
            frame.getContentPane().setBackground(myColour4);
            frame.setSize(1000, 1000);
        }
    }
}
        
    

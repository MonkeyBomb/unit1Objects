import java.awt.Color;
public class TurtleLab
{
    public static void main(String [] args)
    {
        World lab = new World();
        Turtle turtle = new Turtle(lab);
        Turtle turtle2 = new Turtle(lab);
        turtle.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.BLACK);
        turtle.penDown();
        turtle2.penDown();
        turtle.forward(50);
        turtle2.turn(78);
        
        for (;;)
        {
            turtle.forward(40);
            turtle.turn(-15);
             
        
        
        
          turtle2.forward();
          turtle2.turn(90);
            
            
        }
    }    
}
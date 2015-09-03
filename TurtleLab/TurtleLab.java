import java.awt.Color;
public class TurtleLab
{
    public static void main(String [] args)
    {
        World lab = new World(1920,1080);
        Turtle turtle = new Turtle(lab);
        Turtle turtle2 = new Turtle(lab);
        turtle.setPenColor(Color.BLUE);
        turtle2.setPenColor(Color.GREEN);
        turtle.penDown();
        turtle2.penDown();
        turtle.forward(50);
        turtle2.turn(78);
        int turn = 0;
        while(true)
        {
          turtle.forward(100);
          turtle.turn(90);
          //turtle.forward(30);
          turtle.turn(29);
          //turtle.forward(10);
          // turtle.turn(200);
          //turtle.forward(30);
          //turtle.turn(-190);
          
          turtle2.forward(150); 
          turn += 90;
          turtle2.turn(turn);
          turtle2.turn(10);
          turtle2.penUp();
          turtle2.forward(100);
          turtle2.penDown();
          turtle2.turn(turn);
          turtle2.turn(66);
      
            
        }
    }    
}
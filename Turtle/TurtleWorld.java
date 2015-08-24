import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.BLUE);
        turtle.penDown();
        turtle.forward(50);
        turtle.turn(78);
        turtle.forward(10);
        for (;1>0;){
            turtle.forward(10);
            turtle.turn(2);
            
        }
       
        
    }
}

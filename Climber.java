/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Jordan Koski>  // replace <...> with your name
* @version <November 2nd> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Climber extends Robot {

      public Climber()
      {
         super (8, 1, Display.NORTH, Display.INFINITY);
      }
      public Climber (int x, int y, int dir, int beep)
      {   
         super(x, 1, Display.NORTH, 1);
      }
      public void turnAround()
      {
      turnLeft();
      turnLeft();
      }
      public void turnRight()
      {
      turnLeft();
      turnLeft();
      turnLeft();
      }
      public void climbUpRight()
      {
      turnLeft();
      move();
      move();
      turnRight();
      move();
      }
      public void climbUpLeft()
      {
      turnLeft();
      move();
      move();
      turnLeft();
      move();
      }
      public void climbDownRight()
      {
      move();
      turnRight();
      move();
      move();
      turnLeft();
      }
      public void climbDownLeft()
      {
      move();
      turnLeft();
      move();
      move();
      turnRight();
      }
      public String toString(){
      return "ok";
      }

  public static void main(String[] args) {
          
             Display.openWorld("maps/mountain.map");
   Display.setSize(16, 16);
   Display.setSpeed(5);
   
   Climber pete = new Climber();
   Climber jack = new Climber();
     
   pete.putBeeper();
   pete.turnRight();
   jack.turnRight();
   pete.move();
   jack.move();
   jack.climbUpRight();
   pete.climbUpRight();
   jack.climbUpRight();
   pete.climbUpRight();
   jack.climbUpRight();
   pete.climbUpRight();
   pete.climbDownRight();
   jack.climbDownRight();
   pete.climbDownRight();
   pete.pickBeeper();
   pete.climbUpLeft();
   jack.climbUpLeft();
   pete.turnAround();
   pete.climbUpLeft();
   jack.climbDownLeft();
   pete.climbDownLeft();
   jack.climbDownLeft();
   pete.climbDownLeft();
   jack.climbDownLeft();
   pete.climbDownLeft();
   pete.move();
   jack.move();
   pete.putBeeper();
   pete.explode();
   jack.explode();
   


}
}



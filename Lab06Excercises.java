/**
*
* @author <Jordan Koski>  // 
* @version <17th November> // 
*/


   import edu.fcps.karel2.Display;
   import edu.fcps.karel2.Robot;
   import javax.swing.JOptionPane;
    public class Lab06Excercises
   {
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/" + filename + ".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         task_07(); 
         task_08(); 
         task_09(); 
         task_10(); 
         task_11(); 
         task_12(); 
      }
       public static void task_07()	
      { 
         while (temp.nextToABeeper())            
         {                          
         temp.move();
         count++;                      
         }
         
         
         Robot temp = new Athlete(1, 1, Display.EAST, 0);
      
      }
       public static void task_08()	
      { 
         while (!temp.nextToARobot())
         {
         temp.move();
         }
   
         Robot temp = new Athlete(1, 2, Display.EAST, 0);
      	
      }
       public static void task_09()	
      { 
       for(int k=0, k<5, k++)
         {   
         for (int n=0, n<4, n++)
         {
         temp.putBeeper();
         }
         temp.move();  
         }
         
         Robot temp = new Athlete(1, 3, Display.EAST, 0);
       
      }
       public static void task_10()	
      { 
         while (temp.frontIsClear())
            {
            temp.putBeeper();
            temp.move();
         }
         temp.putBeeper();
           
                  Robot temp = new Athlete(1, 4, Display.EAST, 0);
      
      }
       public static void task_11()	
       {   
         while (!temp.rightIsClear())
         {
               temp.putBeeper();
               temp.move();
         }     
                  
         Robot temp = new Athlete(1, 5, Display.EAST, 0);
         
      
      }
       public static void task_12()
      { 
      
         while (temp.rightIsClear()||!temp.nextToABeeper())
         {
         temp.move();
         }
         
         Robot temp = new Athlete(1, 6, Display.EAST, 0);
      
      }
   }










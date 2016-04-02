import java.util.Scanner;

public class superdungeon
{
   
    
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
        
        for (boolean gameLoop = true) {
            System.out.println();
            
            char direction = input.next().charAt(0);
            
            if (direction == 'q' || direction == 'Q') {
                gameLoop = false;
            }
            else if (direction == 'n' || direction == 'N') {
                if (n != null) {
                    currentRoom = 
                }
            }
            else if (direction == 'e' || direction == 'E') {
                 if (e != null) {
                    currentRoom = 
                } 
            }
            else if (direction == 'w' || direction == 'W') {
                 if (w != null) {
                    currentRoom = 
                } 
            }
            else if (direction == 's' || direction == 'S') {
                if (s != null) {
                    currentRoom = 
                }
            }
            else {
                System.out.println(direction + " is an invalid choice");
            }
        }
        
        System.out.printkn("Thanks for playing");
    }
}
package rockpaperscissors;
import java.util.Scanner;
/**
 *
 * @author Britt
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yourHand = 0;
        int computerHand = 0;
        String theWinner = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("\tMenu\n\n(1) Rock\n(2) Paper\n(3) Scissors" + "\n\nEnter Your Hand (1, 2, or 3):");
        yourHand = in.nextInt();
        computerHand = ((int)(Math.random() * 100) % 3 +1);
        
        if(yourHand == computerHand)
            theWinner = "TIE";
        if(yourHand == 1)
        {
            if(computerHand == 2)
                theWinner = "COMPUTER";
            else if(computerHand == 3)
                theWinner = "YOU";
        }
        else if(yourHand == 2)
        {
          if(computerHand == 1)
                theWinner = "YOU";
            else if(computerHand == 3)
                theWinner = "COMPUTER";               
        }
        else if (yourHand == 3)
        {
           if(computerHand == 1)
                theWinner = "COMPUTER";
            else if(computerHand == 2)
                theWinner = "YOU";
        }
        System.out.println("You entered: " + yourHand);
        System.out.println("Computer played: " + computerHand);
        System.out.println("The winner is:" + theWinner);
    }
    
}

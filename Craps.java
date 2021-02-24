
/**
 * Allows user to play a game of craps
 *
 * @author Eliza Williams
 * @version 2021-02-02
 */
import java.util.Scanner;
public class Craps
{
    public static void game(Scanner in)
    {
        System.out.println();
        System.out.println("Press <Enter> to roll... ");
        String pause = in.nextLine();
        Die die = new Die();
        int d1 = die.roll();
        int d2 = die.roll();
        System.out.println(d1+", "+d2);
        if (d1 + d2 == 7 || d1 + d2 == 11)
        {
            System.out.println("Well done. You've rolled a "+(d1 + d2)+" on your first roll and won!");
        }
        else if (d1 + d2 == 2 || d1 + d2 == 3 || d1 + d2 == 12)
        {
            System.out.println("Sucks to suck! You've rolled a "+(d1 + d2)+" on your first roll and lost.");
        }
        else
        {
            int point = d1 + d2;
            System.out.println("Your point is now "+(d1+d2)+" so remember it, and DON'T roll a 7.");
            System.out.println("Press <Enter> to roll... ");
            pause = in.nextLine();
            int d3 = die.roll();
            int d4 = die.roll();
            System.out.println(d3+", "+d4);
            while (d3 + d4 != 7 && d3 + d4 != point)
            {
                System.out.println("You must keep rolling...");
                System.out.println("Press <Enter> to roll... ");
                pause = in.nextLine();
                d3 = die.roll();
                d4 = die.roll();
                System.out.println(d3+", "+d4);
            }
            if (d3 + d4 == 7)
            {
                System.out.println("Sucks to suck! You've rolled a 7 before your point and lost.");
            }
            else if (d3 + d4 == point)
            {
                System.out.println("CONGRATS. You've rolled your point ("+point+") and won!!!");
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome! Would you like to play craps? (Y/n)");
        String playGame = in.nextLine();
        if (playGame.equals("") || !playGame.substring(0,1).equalsIgnoreCase("n"))
        {
            System.out.println("Do you need instructions? (Y/n)");
            String instructions = in.nextLine();
            if (instructions.equals("") || !instructions.substring(0,1).equalsIgnoreCase("n"))
            {
                System.out.println("The rules for the game of craps are pretty simple: ");
                System.out.println("A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over."); 
                System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
                System.out.println("The player continues to roll the two dice again until one of two things happens:");
                System.out.println("either they roll the 'point' from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
            }
            while (playGame.equals("") || !playGame.substring(0,1).equalsIgnoreCase("n"))
            {
                game(in);
                System.out.println("Good game! Would you like to play again? (Y/n)");
                playGame = in.nextLine();
            }
        }
        System.out.println("Goodbye!");
    }
}


/* 

COMMENTS FROM THE INSTRUCTOR:

Fantastic implementation of the Craps game, with very clean code, well-organized
and easy to read/follow. You split it up into a couple of static methods which
was a good idea. Could have extended that to the instructions part as well,
of course. 

Nicely done!

SCORE: 15/15

*/


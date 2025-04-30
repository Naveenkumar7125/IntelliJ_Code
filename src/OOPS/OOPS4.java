package OOPS;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class OOPS4 {
    public static void main(String[] args) {
        GameRules g = new GameRules();
        g.game();
    }
}

class GameRules
{
    void game() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("------------- Game Starts.....! -------------");
        System.out.println("Moves --> Rock, Paper, Siccor (Not a Case Sensitive)");
        System.out.print("Enter your Move : ");
        String s = sc.next().toLowerCase();
        String moves[] = {"rock", "paper", "siccor"};
        String c = moves[r.nextInt(3)];
        System.out.println("Your Move --> "+s);
        System.out.println("Computer Move --> "+c);

        if(s.equals(c))
        {
            System.out.println("Match Draw...!!");
        }
        else if(s.equals(moves[0]) || s.equals(moves[1]) || s.equals(moves[2]))
        {
            if((s.equals("rock") && c.equals("siccor")) || (s.equals("siccor") && c.equals("paper")) || (s.equals("paper") && c.equals("rock")))
                System.out.println("Congratulations!!...You won the game...!");
            else
                System.out.println("Computer Won the game");
        }
        else
        {
            System.out.println("Enter the Move Correctly...");
        }
//        System.out.println("\n\n");


    }


}

// single object or single interface that represents different types of behaviors
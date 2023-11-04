
import java.sql.PseudoColumnUsage;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ChanceGameRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Monty Hall Game! \n");
        System.out.print("Where do you think the car is? Enter 1, 2 or 3: ");
        int firstGuess = s.nextInt();
        s.nextLine();
        ChanceGame lucki = new ChanceGame(firstGuess);
        System.out.println("One of the goats is behind door " + lucki.goatDoor());
        System.out.println("Do you want to switch your guess? Yes or No: ");
        String yesOrNo = s.nextLine();
        int firstGuess2 = firstGuess;
        if (yesOrNo.equals("Yes")) {
            System.out.println("Guess switched from to " + firstGuess + " to " + lucki.doorSwitch());
        }
        //System.out.print("The car is behind door " + lucki.getWinningDoor() + " ");
        int test = lucki.getPlayerChoice();
        System.out.println(test);
        if (lucki.isWin(lucki.getPlayerChoice())) {
            System.out.println("You won the car!");
        }else {
            System.out.println("The car is behind door " + lucki.getWinningDoor() + " You lost! (Or you could say you won a goat!");
        }


    }
}

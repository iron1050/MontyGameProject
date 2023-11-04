
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
        if (lucki.isWin(firstGuess)) {
            ArrayList<Integer> pHolder = lucki.getNumbers();
            pHolder.remove(pHolder.indexOf(firstGuess));
            int doorOpen1 = (int) (Math.random() * 2);
            System.out.println("One of the goats is behind door number " + pHolder.indexOf(doorOpen1) );
            pHolder.remove(pHolder.indexOf(doorOpen1));
            //System.out.println("Guess switched from " + firstGuess + " to " + pHolder.get(0) );
        }else if (!lucki.isWin((firstGuess))) {
            ArrayList<Integer> pHolder = lucki.getNumbers();
            pHolder.remove(pHolder.indexOf(firstGuess));
            pHolder.remove(pHolder.indexOf(lucki.getWinningDoor()));
            System.out.println("One of the goats is behind door number " + pHolder.get(0));
        }

        System.out.println("Do you want to switch your guess? Yes or No: ");
        String yesOrNo = s.nextLine();
        ArrayList<Integer> pHolder1 = lucki.getNumbers();
        if (yesOrNo.equals("Yes")) {

            int firstGuess2 = firstGuess;
            firstGuess = pHolder1.get(0);
            System.out.println("Guess switched from to " + firstGuess2 + " to " + pHolder1.get(0));
        }
        //System.out.println((lucki.getNumbers()).get(1));
        System.out.print("The car is behind door " + lucki.getWinningDoor() + " ");
        if (lucki.isWin(firstGuess)) {
            System.out.print("You won the car!");
        }else {
            System.out.print(". You lost! (Or you could say you won a goat!");
        }


    }
}

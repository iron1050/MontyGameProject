
import java.util.ArrayList;
import java.util.Arrays;

public class ChanceGame {
    int winningDoor = doorChoose();
    int playerChoice;

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));



    public ChanceGame(int playerChoice) {
        this.playerChoice = playerChoice;
    }

    public int doorChoose() {
        return (int) (Math.random() * 3) + 1;
    }

    public boolean isWin(int guess) {
        if (guess == winningDoor) {
            return true;
        }else { return false;}
    }


    public void setPlayerChoice(int playerChoice) {
        this.playerChoice = playerChoice;
    }

   public ArrayList<Integer> getNumbers() {
        return numbers;
   }

    public int getWinningDoor() {
        return winningDoor;
    }
}

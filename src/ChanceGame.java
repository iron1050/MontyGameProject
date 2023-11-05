


public class ChanceGame {
    int winningDoor = doorChoose();
    int playerChoice;




    public ChanceGame(int playerChoice) {
        this.playerChoice = playerChoice;
    }

    public int doorChoose() {

        return (int) ((Math.random() * 3) + 1);
    }

    public boolean isWin(int guess) {
        if (guess == winningDoor) {
            return true;
        }else { return false;}
    }
    public int doorSwitch() {
        if (playerChoice == 1 && winningDoor == 1) {
            int oneTime = (int) (Math.random() * 2);
            playerChoice = oneTime;
            return oneTime;
        }
        if (playerChoice == 1 && winningDoor == 2) {
            playerChoice = 2;
            //return 3;
            return playerChoice;
        }
        if (playerChoice == 1 && winningDoor == 3) {
            playerChoice = 3;
            //return 2;
            return playerChoice;
        }
        if (playerChoice == 2 && winningDoor == 1) {
            playerChoice = 1;
            //return 3;
            return playerChoice;
        }
        if (playerChoice == 2 && winningDoor == 2) {
            int twoTime = (int) (Math.random() * 2);
            if (twoTime == 0) {
                playerChoice = 3;
                //return 1;
                return playerChoice;
            }
            if (twoTime == 1) {
                playerChoice = 1;
                //return 3;
                return playerChoice;
            }
        }
        if (playerChoice == 2 && winningDoor == 3) {
            playerChoice = 3;
            //return 1;
            return playerChoice;
        }
        if (playerChoice == 3 && winningDoor == 1) {
            playerChoice = 1;
            //return 2;
            return playerChoice;
        }
        if (playerChoice == 3 && winningDoor == 2) {
            playerChoice = 3;
            //return 1;
            return playerChoice;
        }
        if (playerChoice == 3 && winningDoor == 3) {
            int threeTime = (int) ((Math.random() * 2) + 2);
            if (threeTime == 2) {
                playerChoice = 1;
                //return 2;
                return playerChoice;
            }
            if (threeTime == 3)
                playerChoice = 2;
                //return 3;
                return playerChoice;
        }
        return 0;

    }
    public int goatDoor() {
        if (playerChoice == 1 && winningDoor == 1) {
            int oneTime = (int) (Math.random() * 2);
            return oneTime;
        }
        if (playerChoice == 1 && winningDoor == 2) {
            return 3;
        }
        if (playerChoice == 1 && winningDoor == 3) {
            return 2;
        }
        if (playerChoice == 2 && winningDoor == 1) {
            return 3;
        }
        if (playerChoice == 2 && winningDoor == 2) {
            int twoTime = (int) (Math.random() * 2);
            if (twoTime == 0) {
                return 1;
            }
            if (twoTime == 1) {
                return 3;
            }
        }
        if (playerChoice == 2 && winningDoor == 3) {
            return 1;
        }
        if (playerChoice == 3 && winningDoor == 1) {
            return 2;
        }
        if (playerChoice == 3 && winningDoor == 2) {
            return 1;
        }
        if (playerChoice == 3 && winningDoor == 3) {
            int threeTime = (int) ((Math.random() * 2) + 1);
            if (threeTime == 1) {
                return 1;
            }
            if (threeTime == 2)
                return 2;
        }
        return 38;
    }
    public void setPlayerChoice(int playerChoice) {
        this.playerChoice = playerChoice;
    }


    public int getWinningDoor() {
        return winningDoor;
    }

    public int getPlayerChoice() {
        return playerChoice;
    }
}

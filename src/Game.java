
import java.util.Scanner;

public class Game {
    Scanner gameReader;
    private int numPlayers;
    private int winningScore;

    public Game() {
        gameReader = new Scanner(System.in);
        numPlayers = 2;
        winningScore = 30;
    }

    public void gameInit() {
        //display game title
        //ask for player names and welcome them
        System.out.println("ENTER PLAYER ONE'S NAME: ");
        Player playerOne = new Player(gameReader.nextLine());
        System.out.println("ENTER PLAYER TWO'S NAME: ");
        Player playerTwo = new Player(gameReader.nextLine());
        System.out.println("WELCOME " + playerOne.getName() + " AND " + playerTwo.getName() + "!");

    }

    public void displayRules() {
        boolean validInput = false;
        while (validInput == false) {
            System.out.println("DO YOU WANT TO SEE THE RULES?\nY / N");
            String viewRules = gameReader.nextLine();
            if (viewRules.equals("y")) {
                System.out.println("*Block of rules*");
                validInput = true;
            } else if (viewRules.equals("n")) {
                System.out.println("AH, SO YOU'VE BEEN HERE BEFORE. LET'S GET GOING THEN!");
                validInput = true;
            } else {
                System.out.println("NOT A VALID INPUT. TRY AGAIN.");
            }
        }
    }

    public void startGame() {
        boolean startGame = false;
        while (startGame == false) {
            System.out.println("READY TO BEGIN?\nY / N");
            String readyCheck = gameReader.nextLine();
            if (readyCheck.equals("y")) {
                playGame();
                startGame = true;
            } else if (readyCheck.equals("n")) {
                System.out.println("SEE YOU NEXT TIME, SCAREDY CAT!");
                System.exit(0);
            } else {
                System.out.println("NOT A VALID INPUT. TRY AGAIN.");
            }
        }
    }

    public void playGame() {
        System.out.println("*Run game loop*");

        //roll dice
        //let them choose what to add to their score
        //setPlayerScore();
        //check if they win or bust
        //if someone wins
        //displayScoreboard();
        //ask if they want to play again
        //else repeat for next player

    }

    public void displayScoreboard() {
        System.out.print("*Display scoreboard");
        //display the winner
        //display total session wins per player
    }

}

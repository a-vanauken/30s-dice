
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
        System.out.println("\n" +
                "\n" +
                "    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n" +
                "    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n" +
                "    ////                                                                                                        ////\n" +
                "    ////       _________     __________                    ______       _________      _______     _________    ////\n" +
                "    ////      /____    /|   / _____  \\_\\   ______         / __   \\     /__    __/|    /  ____/|   /   _____/|   ////\n" +
                "    ////      _|__/   / /  / /    /  / /  /  ___/|       / /   |  \\    |_ /  /|_|/   /  /|__|/   /   /____ |/   ////\n" +
                "    ////     /___    / /  / /    /  / /   \\  \\__|/      / /    /  /|     /  / /     /  / /      /   _____/|     ////\n" +
                "    ////    _|__/   / /  / / ___/  / /   __\\  \\        / /____/  / | ___/  /_/_    /  /_/__    /   /____ |/     ////\n" +
                "    ////   /_______/ /   |________/ /   /_____/|      /_________/ / /_________/|  /_______/|  /________/|       ////\n" +
                "    ////   |_______|/    |________|/    |_____|/      |_________|/  |_________|/  |_______|/  |________|/       ////\n" +
                "    ////                                                                                                        ////\n" +
                "    ////                                                                                                        ////\n" +
                "    ////                                            PRESENTED  BY:                                              ////\n" +
                "    ////                                                                                                        ////\n" +
                "    ////                                            ABBY VAN AUKEN                                              ////\n" +
                "    ////                                                                                                        ////\n" +
                "    ////                                      2022 SEMESTER FINAL PROJECT                                       ////\n" +
                "    ////                                                                                                        ////\n" +
                "    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n" +
                "    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////\n" +
                "\n" +
                "\n");
        //ask for player names and welcome them
        System.out.println("ENTER PLAYER ONE'S NAME: ");
        Player playerOne = new Player(gameReader.nextLine());
        System.out.println("ENTER PLAYER TWO'S NAME: ");
        Player playerTwo = new Player(gameReader.nextLine());
        //System.out.println("WELCOME " + playerOne.getName() + " AND " + playerTwo.getName() + "!");
        System.out.println("\n +-------------------- WELCOME " + playerOne.getName() + " AND " + playerTwo.getName() + "! --------------------+\n");

    }

    public void displayRules() {
        boolean validInput = false;
        while (validInput == false) {
            System.out.println("DO YOU WANT TO SEE THE RULES?\nY / N");
            String viewRules = gameReader.nextLine();
            if (viewRules.equals("y")) {
                System.out.println("\n    +-----------------------------------------------------------------------+\n" +
                        "    |                                RULES                                  |\n" +
                        "    +-----------------------------------------------------------------------+\n" +
                        "    |                                                                       |\n" +
                        "    |  EACH TURN:                                                           |\n" +
                        "    |   A player will roll a pair of dice. They will then choose to         |\n" +
                        "    |   add the value of one or both dice to their player score. If         |\n" +
                        "    |   after this their score is not 30, the turn then passes to the       |\n" +
                        "    |   next player.                                                        |\n" +
                        "    |                                                                       |\n" +
                        "    |  YOU WIN WHEN:                                                        |\n" +
                        "    |   You are the first player to reach a score of exactly 30 points.     |\n" +
                        "    |                                                                       |\n" +
                        "    |  YOU \"BUST\" WHEN:                                                     |\n" +
                        "    |   Your score goes over 30. If this happens your player score gets     |\n" +
                        "    |   reset back to zero. The game continues.                             |\n" +
                        "    |                                                                       |\n" +
                        "    +-----------------------------------------------------------------------+\n");

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
        //create set of dice
        Die dieOne = new Die();
        Die dieTwo = new Die();
        //roll dice to see who goes first
        System.out.println("WE'LL ROLL TO SEE WHO GOES FIRST.");
        boolean playerSelected = false;
        while (playerSelected == false) {
            System.out.println("\nPLAYER ONE ROLLED:");
            dieOne.roll();
            System.out.println("\nPLAYER TWO ROLLED:");
            dieTwo.roll();
            if (dieOne.getFaceValue() > dieTwo.getFaceValue()) {
                System.out.println("\nPLAYER ONE GOES FIRST!");
                playerSelected = true;
            } else if (dieOne.getFaceValue() < dieTwo.getFaceValue()) {
                System.out.println("\nPLAYER TWO GOES FIRST!");
                playerSelected = true;
            } else {
                System.out.println("\nTIE! ROLL AGAIN!");
            }
        }
        //start turn

        //roll dice
        System.out.println("\nYOU ROLLED: ");
        dieOne.roll();
        dieTwo.roll();
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


import java.util.Scanner;

public class Game
{
    Scanner gameReader;
    private final int numPlayers = 2;
    private final int winningScore = 30;

    final int playerOne = 0;
    final int playerTwo = 1;

    //Creating two players
    private final Player[] players = new Player[numPlayers];

    public Game()
    {
        //Creating a single Scanner that can be used throughout the game
        gameReader = new Scanner(System.in);
    }

    public void welcome()
    {
        //Display game title
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
        //Ask for player names and welcome them
        System.out.println("ENTER PLAYER ONE'S NAME: ");
        players[playerOne] = new Player(gameReader.nextLine());
        System.out.println("ENTER PLAYER TWO'S NAME: ");
        players[playerTwo] = new Player(gameReader.nextLine());
        System.out.println("\n+---------------------------------------------+\n       WELCOME " + players[playerOne].getName() + " AND " + players[playerTwo].getName() + "!\n+---------------------------------------------+\n");
    }

    public void displayRules()
    {
        //Ask the user if they want to see the rules before starting
        boolean validInput = false;
        while (!validInput)
        {
            System.out.println("DO YOU WANT TO SEE THE RULES?\nY / N");
            String viewRules = gameReader.nextLine();
            if (viewRules.equals("y"))
            {
                System.out.println("\n+-----------------------------------------------------------------------+\n" +
                        "|                                RULES                                  |\n" +
                        "+-----------------------------------------------------------------------+\n" +
                        "|                                                                       |\n" +
                        "|  EACH TURN:                                                           |\n" +
                        "|   A player will roll a pair of dice. They will then choose to         |\n" +
                        "|   add the value of one or both dice to their player score. If         |\n" +
                        "|   after this their score is not 30, the turn then passes to the       |\n" +
                        "|   next player.                                                        |\n" +
                        "|                                                                       |\n" +
                        "|  YOU WIN WHEN:                                                        |\n" +
                        "|   You are the first player to reach a score of exactly 30 points.     |\n" +
                        "|                                                                       |\n" +
                        "|  YOU \"BUST\" WHEN:                                                     |\n" +
                        "|   Your score goes over 30. If this happens your player score gets     |\n" +
                        "|   reset back to zero. The game continues.                             |\n" +
                        "|                                                                       |\n" +
                        "+-----------------------------------------------------------------------+");

                validInput = true;
            } else if (viewRules.equals("n"))
            {
                validInput = true;
            } else
            {
                System.out.println("NOT A VALID INPUT. TRY AGAIN.");
            }
        }
    }

    public boolean startGame()
    {
        //Ask the user if they are ready to begin. If not we exit.
        boolean startGame = false;
        while (!startGame)
        {
            System.out.println("\nREADY TO BEGIN?\nY / N");
            String readyCheck = gameReader.nextLine();
            if (readyCheck.equals("y"))
            {
                startGame = true;
            } else if (readyCheck.equals("n"))
            {
                System.out.println("SEE YOU NEXT TIME!");
                System.exit(0);
            } else
            {
                System.out.println("NOT A VALID INPUT. TRY AGAIN.");
            }
        }
        return true;
    }

    public void playGame()
    {
        //Main game loop
        //Create set of dice
        Die dieOne = new Die();
        Die dieTwo = new Die();
        //Roll dice to see who goes first
        System.out.println("\n+---------------------------------------------+\n       LET'S ROLL TO SEE WHO GOES FIRST\n+---------------------------------------------+");
        int currentPlayer = -1;
        while (currentPlayer == -1)
        {
            System.out.println("\n" + players[playerOne].getName() + " ROLLED:");
            Die.waitTimer(2000);
            dieOne.roll();
            System.out.println("DIE ONE: " + dieOne.getFaceValue());
            Die.waitTimer(1000);
            System.out.println("\n" + players[playerTwo].getName() + " ROLLED:");
            Die.waitTimer(1000);
            dieTwo.roll();
            System.out.println("DIE TWO: " + dieTwo.getFaceValue());

            //Compare the values rolled and give the higher roller the currentPlayer designation so that they go first
            if (dieOne.getFaceValue() > dieTwo.getFaceValue())
            {
                currentPlayer = playerOne;
            } else if (dieOne.getFaceValue() < dieTwo.getFaceValue())
            {
                currentPlayer = playerTwo;
            } else
            {
                System.out.println("\nTIE! ROLL AGAIN.\n\n+---------------------------------------------+");
            }
        }
        //Announce who goes first
        Die.waitTimer(2000);
        System.out.println("\n" + players[currentPlayer].getName() + " GOES FIRST!");

        //Start first turn. Continue looping until a winner is declared.
        boolean winner = false;
        while (!winner)
        {
            //Announces the player turn and what their score is.
            Die.waitTimer(2000);
            System.out.println("\n+---------------------------------------------+\n     " + players[currentPlayer].getName() + "'S TURN\n     CURRENT SCORE: " + players[currentPlayer].getScore() + "\n+---------------------------------------------+\n");
            //Roll dice and display their values
            System.out.println("YOU ROLLED: ");
            Die.waitTimer(1000);
            dieOne.roll();
            System.out.println("DIE ONE: " + dieOne.getFaceValue());
            Die.waitTimer(1000);
            dieTwo.roll();
            System.out.println("DIE TWO: " + dieTwo.getFaceValue());
            int diceTotal = dieOne.getFaceValue() + dieTwo.getFaceValue();
            Die.waitTimer(1000);
            System.out.println("\nTOTAL: " + diceTotal + "\n");

            //Make the user choose if they want to add one or both dice to their score
            boolean userSelection = false;
            while (!userSelection)
            {
                System.out.println("PRESS (1) TO ONLY ADD DIE ONE TO YOUR SCORE\nPRESS (2) TO ONLY ADD DIE TWO TO YOUR SCORE\nPRESS (3) TO ADD BOTH DICE TO YOUR SCORE");
                int userChoice = gameReader.nextInt();
                //Line below is used to skip the remaining "\n" after using nextInt so that the next nextLine works properly
                gameReader.nextLine();
                if (userChoice == 1)
                {
                    players[currentPlayer].setScore(dieOne.getFaceValue());
                    userSelection = true;
                } else if (userChoice == 2)
                {
                    players[currentPlayer].setScore(dieTwo.getFaceValue());
                    userSelection = true;
                } else if (userChoice == 3)
                {
                    players[currentPlayer].setScore(diceTotal);
                    userSelection = true;
                } else
                {
                    System.out.println("INVALID INPUT. PLEASE SELECT OPTION 1, 2, OR 3.");
                }
            }

            //Once the value(s) have been added to the users score, evaluate if they've won or bust.
            if (players[currentPlayer].getScore() == winningScore)
            {
                System.out.println("\nYOUR SCORE IS EXACTLY 30! YOU WIN!");
                winner = true;
                players[currentPlayer].addWin();
            } else
            {
                //If their score is over 30 with additions, set their score back to 0.
                if (players[currentPlayer].getScore() > winningScore)
                {
                    players[currentPlayer].setScore(0);
                    System.out.println("\nOOF, YOUR SCORE IS MORE THAN 30. YOU BUST!\nYOUR SCORE IS RESET BACK TO: " + players[currentPlayer].getScore());
                } else
                //If they didn't win or bust, add the values they chose to their score.
                {
                    System.out.println("\nYOUR NEW SCORE IS: " + players[currentPlayer].getScore() + "\n\nNEXT PLAYER'S TURN!");
                }
                // If they haven't won, swap the currentPlayer and keep going.
                if (currentPlayer == playerOne)
                    currentPlayer = playerTwo;
                else
                    currentPlayer = playerOne;
            }

        }
        //Once a winner has been chosen, we then display the scoreboard.
        displayScoreboard();
    }

    public boolean playAgain()
    {
        //Ask the user if they want to play again after a winner has been announced
        boolean playAgain = false;
        while (!playAgain)
        {
            System.out.println("\nPLAY AGAIN?\nY / N");
            String userAnswer = gameReader.nextLine();
            //If yes we will reset each score back to 0, break out of the loop, and return true back to main.
            if (userAnswer.equals("y"))
            {
                players[playerOne].setScore(0);
                players[playerTwo].setScore(0);
                playAgain = true;
            } else if (userAnswer.equals("n"))
            {
                System.out.println("SEE YOU NEXT TIME!");
                return false;
            } else
            {
                System.out.println("NOT A VALID INPUT. TRY AGAIN.");
            }
        }
        return true;
    }

    public void displayScoreboard()
    {
        //Made these variables just to keep the scoreboard clean
        String playerOneName = players[playerOne].getName();
        String playerTwoName = players[playerTwo].getName();
        int playerOneWins = players[playerOne].getWins();
        int playerTwoWins = players[playerTwo].getWins();

        //Print out the player name and cumulative wins over the session
        System.out.print(
                "\n+-----------------------------------------------------------------------+\n" +
                        "|                              SCOREBOARD                               |\n" +
                        "+-----------------------------------------------------------------------+\n" +
                        "\n" +
                        "            " + playerOneName + " WIN COUNT: " + playerOneWins + "\n" +
                        "\n" +
                        "            " + playerTwoName + " WIN COUNT: " + playerTwoWins + "\n" +
                        "\n" +
                        "+-----------------------------------------------------------------------+\n" +
                        "|                                                                       |\n" +
                        "+-----------------------------------------------------------------------+\n");
    }
}

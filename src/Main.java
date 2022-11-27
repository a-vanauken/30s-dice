//Abby Trevino
//CSC 160 Computer Science I: Final Project
//November 27th, 2022
//Create the "30s" dice game where two players roll dice until one of them reaches 30.

import java.util.Scanner;
public class Main {
    public static void main(String[] Args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("ENTER PLAYER ONE NAME: ");
        String playerOne = inputReader.nextLine();
        System.out.println("ENTER PLAYER TWO NAME: ");
        String playerTwo = inputReader.nextLine();
        System.out.println("WELCOME " + playerOne.toUpperCase() + " AND " + playerTwo.toUpperCase() + "!");

        boolean validInput = false;
        while (validInput == false) {
            System.out.println("DO YOU WANT TO SEE THE RULES?\nY / N");
            String viewRules = inputReader.nextLine();
            if (viewRules.equals("y")) {
                displayRules();
                validInput = true;
            } else if (viewRules.equals("n")) {
                System.out.println("AH, SO YOU'VE BEEN HERE BEFORE. LET'S GET GOING THEN!");
                validInput = true;
            } else {
                System.out.println("NOT A VALID INPUT. TRY AGAIN.");
            }
        }

        boolean startGame = false;
        while (startGame == false) {
            System.out.println("READY TO BEGIN?\nY / N");
            String readyCheck = inputReader.nextLine();
            if (readyCheck.equals("y")) {
                gameLoop();
                startGame = true;
            } else if (readyCheck.equals("n")) {
                System.out.println("SEE YOU NEXT TIME, SCAREDY CAT!");
                System.exit(0);
            } else {
                System.out.println("NOT A VALID INPUT. TRY AGAIN.");
            }
        }

    }

    public static void gameLoop() {
        System.out.println("*Run game loop*");
    }

    public static void displayRules() {
        System.out.println("*Display rules*");
    }

}

//Abby Trevino
//CSC 160 Computer Science I: Final Project
//November 27th, 2022
//Create the "30s" dice game where two players roll dice until one of them reaches 30.

public class Main
{
    public static void main(String[] Args)
    {
        //Create a new game
        Game game = new Game();
        game.welcome();
        game.displayRules();
        //Once the user confirms they are ready, startGame will return true and we'll begin our game loop
        if (game.startGame())
        {
            boolean continueGame = true;
            while (continueGame)
            {
                game.playGame();
                //Once the playGame block has been completed, we'll check if they want to continue. playAgain returns true or false which tells the continueGame loop what to do.
                continueGame = game.playAgain();
            }
        }
    }
}

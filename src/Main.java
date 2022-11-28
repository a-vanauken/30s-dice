//Abby Trevino
//CSC 160 Computer Science I: Final Project
//November 27th, 2022
//Create the "30s" dice game where two players roll dice until one of them reaches 30.

public class Main {
    public static void main(String[] Args) {
        Game game = new Game();
        game.gameInit();
        game.displayRules();
        game.startGame();
    }


}

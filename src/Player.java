public class Player
{
    private final String name;
    private int score;
    private int wins;

    public Player(String playerName)
    {
        name = playerName;
        score = 0;
        wins = 0;
    }


    public String getName()
    {
        //Return the player name in uppercase to match other text formatting
        return name.toUpperCase();
    }

    public int getScore()
    {
        //Return player score
        return score;
    }

    public void setScore(int newScore)
    {
        //If we receive a 0 for new score, that means the player busted and we should reset back to 0. Otherwise increase the score
        if (newScore == 0)
        {
            this.score = 0;
        } else
        {
            this.score += newScore;
        }
    }

    public int getWins()
    {
        //Get win count for printing on scoreboard
        return wins;
    }

    public void addWin()
    {
        //Increase win count for scoreboard tracking
        this.wins++;
    }
}

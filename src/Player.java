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
        return name.toUpperCase();
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int newScore)
    {
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
        return wins;
    }

    public void addWin()
    {
        this.wins++;
    }
}

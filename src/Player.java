public class Player {
    private String name;
    private int score;
    private int wins;

    public Player(String playerName) {
        name = playerName;
        score = 0;
        wins = 0;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        this.score += newScore;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int newWin) {
        this.wins += newWin;
    }
}

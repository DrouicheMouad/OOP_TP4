package tp4.exo2;

public class Score {
    private String playerName;
    private int currentScore;
    private int maxScore;
    
 // Getters
    public String getPlayerName() {
        return playerName;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public int intgetMaxScore() {
        return maxScore;
    }

    // Setters
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
    
    public void setCurrentScore(int currentScore) {
        if (currentScore > this.maxScore)
            this.currentScore = this.maxScore;
        else if (currentScore < 0)
            this.currentScore = 0;
        else
            this.currentScore = currentScore;
    }
    //Q4
    public void display() {
        System.out.printf("Player: %s | Current Score: %d / %d\n", playerName, currentScore, maxScore);
    }
    
    //Constructors 
    //Q5
    public Score() {
        playerName = "unknown";
        maxScore = 100;
        setCurrentScore(0);
    }
    //Q6
    public Score(String playerName) {
        this.playerName = playerName;
        this.maxScore = 100;
        setCurrentScore(0);
    }
    //Q7
    public void addPoints(int points) {
        setCurrentScore(currentScore + points);
    }
}
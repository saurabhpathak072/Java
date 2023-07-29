public class Game {
    private boolean gameOver;
    private int score;
    private int leveCompleted;
    private int bonus;
    private String name;
    private int position = 0;

    Game(boolean isGameOver, int score, int levelCompleted, int bonus) {
        this.gameOver = isGameOver;
        this.score = score;
        this.leveCompleted = levelCompleted;
        this.bonus = bonus;
    }

    protected void getPlayerDetails(String name) {
        this.name = name;
        //  this.position = position;
    }


    protected int calculateFinalScore() {
        int finalScore = score;
        if (gameOver) {
            finalScore += (leveCompleted * bonus);
        }
        return finalScore;
    }

    protected void calculateHighScorePosition(int score) {
        this.score = score;

        if (score >= 1000) {
            this.position = 1;
        } else if (score >= 500) {
            this.position = 2;
        } else if (score >= 100) {
            this.position = 3;
        } else {
            this.position = 4;
        }
    }

    protected void displayHighScorePosition(String name) {

        this.name = name;
        System.out.println(name + " Managed to get into position " + this.position + " on the high score list.");
    }

}

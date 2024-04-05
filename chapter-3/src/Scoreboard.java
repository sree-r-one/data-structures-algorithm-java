public class Scoreboard {
    // Variables

    /**
     * Number of actual entries
     */
    private int numEntries = 0;

    /**
     * Array of game entries
     */
    private GameEntry[] scoreBoard;

    // Constructor

    public Scoreboard(int capacity) {
        scoreBoard = new GameEntry[capacity];
    }

    /**
     * Adds a new score to the sollection it is high enough
     * 
     * @param gameEntry
     */
    public void add(GameEntry gameEntry) {

        // Get score from game entry
        int newScore = gameEntry.getScore();

        // Number of entries is less than the length of the board

        // Check if the score is really a high score ? Check if the the current score is
        // greater than the last score
        if (numEntries < scoreBoard.length || newScore > scoreBoard[numEntries - 1].getScore()) {

            if (numEntries < scoreBoard.length) {
                numEntries++;

                // Shift lowerscore rightward to make room for the new entry
                int j = numEntries - 1;
                while (j > 0 && scoreBoard[j - 1].getScore() < newScore) {
                    scoreBoard[j] = scoreBoard[j - 1];
                    j--;
                }

                // put the entry at the end of score board
                scoreBoard[j] = gameEntry;
            }
        }

        // Add to the board

    }
}

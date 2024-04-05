
/**
 * Class for storing high scores in an array in non decreasing order
 */
public class GameEntry {

    // Variables

    /**
     * Name the person earning the score
     */
    private String name;

    /**
     * Score value
     */
    private int score;

    // Constructor
    public GameEntry(String n, int s) {
        name = n;
        score = s;
    }

    // Methods

    // Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return name field
     */
    public String getName() {
        return name;
    }

    /**
     * @return score field
     */
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " : " + score;
    }

}

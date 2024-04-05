public class GameEntry {

    // Variables
    private String name;

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

    public String getName() {
        return name;
    }

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

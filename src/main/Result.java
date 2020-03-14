public class Result {
    private long score;
    private String state;

    //Constructor
    public Result(long score, String state) {
        this.score = score;
        this.state = state;
    }

    //Getter and Setter
    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}

package exerciseSuggestedSolutions.session2problem5;

public class Player {
    private String firstName;
    private String lastName;
    private int age;
    private int wins;
    private int loses;
    private String sponsor;

    public Player(String firstName, String lastName, int age, int wins, int loses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.wins = wins;
        this.loses = loses;
        this.sponsor = "";
    }

    public Player(String firstName, String lastName, int age, int wins, int loses, String sponsor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.wins = wins;
        this.loses = loses;
        this.sponsor = sponsor;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getAge() {
        return age;
    }

    public double computeWinLossRatio(){
        return this.wins/(this.loses+this.wins);
    }

    @Override
    public String toString() {
        if(this.sponsor.length() > 0){
            return "Player{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", wins=" + wins +
                    ", loses=" + loses +
                    ", sponsor='" + sponsor + '\'' +
                    '}';
        }
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", wins=" + wins +
                ", loses=" + loses +
                '}';
    }
}

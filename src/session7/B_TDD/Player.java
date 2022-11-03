package session7.B_TDD;

public class Player {

    String name;
    private int wins;

    public Player(String name) {
        this.name=name;
        wins = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWins() {
        return wins;
    }

    public void wonMatch() {
        this.wins = this.wins + 1;
    }
}

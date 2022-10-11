package exerciseSuggestedSolutions.session2problem5;

public class Team {
    private String teamName;
    private Player player1;
    private Player player2;

    public Team(String teamName, Player player1, Player player2) {
        this.teamName = teamName;
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public String getTeamName() {
        return teamName;
    }

    public double computeAverageAgeInTeam(){
        return (this.player1.getAge()+this.player2.getAge())/2;
    }
}

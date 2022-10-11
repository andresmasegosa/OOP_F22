package exerciseSuggestedSolutions.session2problem5;

public class Match {
    private Team team1;
    private Team team2;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public double computeAverageAgeInMatch(){
        return (this.team1.getPlayer1().getAge()+
                this.team1.getPlayer2().getAge()+
                this.team2.getPlayer1().getAge()+
                this.team2.getPlayer2().getAge())/4;
    }

    public Player computeBestPlayer(){
        double t1p1 = this.team1.getPlayer1().computeWinLossRatio();
        double t1p2 = this.team1.getPlayer2().computeWinLossRatio();
        double t2p1 = this.team2.getPlayer1().computeWinLossRatio();
        double t2p2 = this.team2.getPlayer2().computeWinLossRatio();

        if(t1p1 >= t1p2 && t1p1 >= t2p1 && t1p1 >= t2p2){
            return this.team1.getPlayer1();
        }else if(t1p2 >= t1p1 && t1p2 >= t2p1 && t1p2 >= t2p2){
            return this.team1.getPlayer2();
        }else if(t2p1 >= t1p1 && t2p1 >= t1p2 && t2p1 >= t2p2){
            return this.team2.getPlayer1();
        }else{
            return this.team2.getPlayer2();
        }
    }

    //input if team 1 or 2 won
    public void matchFinished(Team winner){
        if(this.team1 == winner){
            System.out.println("Team "+this.team1.getTeamName()+" won!");
            this.team1.getPlayer1().setWins(this.team1.getPlayer1().getWins()+1);
            this.team1.getPlayer2().setWins(this.team1.getPlayer2().getWins()+1);
            this.team2.getPlayer1().setLoses(this.team2.getPlayer1().getLoses()+1);
            this.team2.getPlayer2().setLoses(this.team2.getPlayer2().getLoses()+1);
        }else if(this.team2 == winner){
            System.out.println("Team "+this.team2.getTeamName()+" won!");
            this.team1.getPlayer1().setLoses(this.team1.getPlayer1().getLoses()+1);
            this.team1.getPlayer2().setLoses(this.team1.getPlayer2().getLoses()+1);
            this.team2.getPlayer1().setWins(this.team2.getPlayer1().getWins()+1);
            this.team2.getPlayer2().setWins(this.team2.getPlayer2().getWins()+1);
        }
    }

    public static void main(String[] args) {
        Player Tesla = new Player("Nikola","Tesla",25,20,9);
        Player Einstein = new Player("Albert","Einstein",54,21,14);
        Player Hans = new Player("Hans","Heje",22,42,13);
        Player Octavian = new Player("Gaius","Octavian",70,2,20);

        Team teamRed = new Team("Red",Tesla,Einstein);
        Team teamBlue = new Team("Blue",Hans,Octavian);

        Match match = new Match(teamBlue,teamRed);
        match.matchFinished(teamBlue);
        System.out.println("average age is "+match.computeAverageAgeInMatch());
        System.out.println("best player is "+match.computeBestPlayer().toString());
    }
}

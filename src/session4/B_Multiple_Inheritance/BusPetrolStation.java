package session4.B_Multiple_Inheritance;

public class BusPetrolStation {

    public void recharge(Bus vehicle){
        //some code
    }

    public static void main(String[] args) {

        BusPetrolStation busPetrolStation = new BusPetrolStation();

        TeslaModelS teslaModelS = new TeslaModelS();
        //busPetrolStation.recharge(teslaModelS);

        Volvo volvo = new Volvo();
        busPetrolStation.recharge(volvo);

    }

}

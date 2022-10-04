package session4.B_Multiple_Inheritance;

public class ElectricPetrolStation {

    public void recharge(ElectricVehicle vehicle){
        //Some staff to recharchge the vehicle
    }


    public static void main(String[] args) {
        ElectricPetrolStation electricPetrolStation = new  ElectricPetrolStation();

        Porsche911 porsche911 = new Porsche911();
        TeslaModelS teslaModelS = new TeslaModelS();


        electricPetrolStation.recharge(teslaModelS);

    }
}

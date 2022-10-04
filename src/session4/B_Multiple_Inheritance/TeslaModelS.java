package session4.B_Multiple_Inheritance;

public class TeslaModelS extends SportsCar implements ElectricVehicle{
    double batteryLevel = 100;

    @Override
    public boolean goFast() {
        System.out.println("Going Fast!!!");
        batteryLevel-=20;
        return true;
    }

    @Override
    public int speed() {
        return 300;
    }

    @Override
    public double batteryLevel() {
        return batteryLevel;
    }

    public boolean amICool(){
        return true;
    }
}

package session2.B_ReferencesAndAliasing;

class Vehicle {
    int passengers; // number of passengers.
    int fuelcap; // fuel capacity in gallons.
    int mpg; // fuel consumption in miles per gallon.

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();
        v1.passengers = 7;
        v1.fuelcap    = 16;
        v1.mpg        = 21;

        Vehicle v2 = new Vehicle();
        v2.passengers = 0;

        System.out.println(" Passengers: " + v1.passengers);
    }
}


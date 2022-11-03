package session9.d_enums;

enum Planet {
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4);

    private int position;

    Planet(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public static void main(String[] args) {
        Planet p = Planet.EARTH;
        switch (p) {
            case EARTH:
                int pos = p.getPosition();
                System.out.println("It's earth! Our Homeworld.");
                System.out.println("The " + pos + " planet.");
            default:
                System.out.println("It is not earth.");
        }
    }
}
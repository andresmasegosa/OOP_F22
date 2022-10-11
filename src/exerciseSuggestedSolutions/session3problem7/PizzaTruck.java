package exerciseSuggestedSolutions.session3problem7;

public class PizzaTruck implements Kitchen,Vehicle{
    private String maker;
    private String model;
    private int year;
    private int amountOfWheels;

    public PizzaTruck(String maker, String model, int year, int amountOfWheels) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.amountOfWheels = amountOfWheels;
    }
    @Override
    public Pizza producePizza(int pizzaNumber) {
        switch (pizzaNumber){
            case 1:
                return new Pizza("Salami","Small");
            case 2:
                return new Pizza("Vegetarian","Small");
            case 3:
                return new Pizza("Salami","Family");
            case 4:
                return new Pizza("Vegetarian","Family");
            default:
                return new Pizza("Hawaii","Family");
        }
    }

    @Override
    public String getMaker() {
        return this.maker;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getYear() {
        return this.year;
    }

    @Override
    public int getAmountOfWheels() {
        return this.amountOfWheels;
    }

    public static void main(String[] args) {
        PizzaTruck pizzaToFamilia = new PizzaTruck("Ferrari","F40",1999,4);
        System.out.println(pizzaToFamilia.producePizza(3).toString());
    }

}

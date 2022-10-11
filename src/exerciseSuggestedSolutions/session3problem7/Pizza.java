package exerciseSuggestedSolutions.session3problem7;

public class Pizza {
    String pizzaName;
    String size;

    public Pizza(String pizzaName, String size) {
        this.pizzaName = pizzaName;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaName='" + pizzaName + '\'' +
                ", size=" + size +
                '}';
    }
}

package exerciseSuggestedSolutions.session4problem4;

import java.time.LocalDate;
import java.util.Objects;

public class Pizza implements Perishable,Product{
    LocalDate expirationDate;
    String name;
    int price;

    public Pizza(String bestBeforeDate, String name, int price) {
        this.expirationDate = LocalDate.parse(bestBeforeDate);
        this.name = name;
        this.price = price;
    }

    @Override
    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return price == pizza.price && Objects.equals(expirationDate, pizza.expirationDate) && Objects.equals(name, pizza.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expirationDate, name, price);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "expirationDate=" + expirationDate +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

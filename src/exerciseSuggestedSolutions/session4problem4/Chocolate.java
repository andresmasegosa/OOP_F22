package exerciseSuggestedSolutions.session4problem4;

import java.time.LocalDate;
import java.util.Objects;

public class Chocolate implements NonPerishable,Product{
    LocalDate bestBeforeDate;
    String name;
    int price;

    public Chocolate(String bestBeforeDate, String name, int price) {
        this.bestBeforeDate = LocalDate.parse(bestBeforeDate);
        this.name = name;
        this.price = price;
    }

    @Override
    public LocalDate getBestBeforeDate() {
        return this.bestBeforeDate;
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
        Chocolate chocolate = (Chocolate) o;
        return price == chocolate.price && Objects.equals(bestBeforeDate, chocolate.bestBeforeDate) && Objects.equals(name, chocolate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bestBeforeDate, name, price);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "bestBeforeDate=" + bestBeforeDate +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

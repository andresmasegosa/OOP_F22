package exerciseSuggestedSolutions.session4problem4;

import java.time.LocalDate;
import java.util.Objects;

public class Soda implements Bottle,NonPerishable,Product{
    LocalDate bestBeforeDate;
    String name;
    int price;
    int millilitres;

    public Soda(String bestBeforeDate, String name, int price, int millilitres) {
        this.bestBeforeDate = LocalDate.parse(bestBeforeDate);
        this.name = name;
        this.price = price;
        this.millilitres = millilitres;
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
        Soda cocaCola = (Soda) o;
        return price == cocaCola.price && millilitres == cocaCola.millilitres && Objects.equals(bestBeforeDate, cocaCola.bestBeforeDate) && Objects.equals(name, cocaCola.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bestBeforeDate, name, price, millilitres);
    }

    @Override
    public String toString() {
        return "CocaCola{" +
                "bestBeforeDate=" + bestBeforeDate +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", millilitres=" + millilitres +
                '}';
    }

    @Override
    public int getNumberOfMillilitres() {
        return this.millilitres;
    }
}

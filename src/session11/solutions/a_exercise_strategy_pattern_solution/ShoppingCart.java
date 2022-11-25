package session11.solutions.a_exercise_strategy_pattern_solution;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{

    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public double getTotalPrice(){
        double totalPrice=0;
        for (Product product: products){
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }

    public boolean pay(PaymentMethod paymentMethod){
        return paymentMethod.pay(this.getTotalPrice());
    }
}

package exerciseSuggestedSolutions.session4problem4;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    //list of products
    private HashMap<Product,Integer> products;

    public VendingMachine() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product, int amount){
        if(this.products.get(product) != null){
            amount+= this.products.get(product);
        }
        this.products.put(product,amount);

    }

    public void printInventory(){
        for (Map.Entry<Product,Integer> entry : products.entrySet()){
            System.out.println(entry.getKey().toString()+" amount left: "+entry.getValue().toString());
        }
    }


    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        Product kitkat1 = new Chocolate("2023-10-25","Kitkat",25);
        Product kitkat2 = new Chocolate("2024-02-10","Kitkat",25);
        Product cocaCola = new Soda("2030-01-01","CocaCola",15,330);
        Product salamiPizza = new Pizza("2022-11-10","Salami Pizza",20);

        vendingMachine.addProduct(kitkat1,5);
        vendingMachine.addProduct(kitkat1,25);
        vendingMachine.addProduct(kitkat2,3);
        vendingMachine.addProduct(cocaCola,30);
        vendingMachine.addProduct(salamiPizza,5);

        vendingMachine.printInventory();
    }
}

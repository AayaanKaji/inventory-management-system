package src.inventory;

import java.util.List;

public class ViewData {
    public static void print() {
        List<String> lines = RetriveData.readProducts();
        for (String line : lines) {
            String[] products = line.split(", ");
            System.out.println("product_id\t" + "product_name\t" +  "cost_per_item\t" + "quantity");
            System.out.println(products[0] + "\t" + products[1] + "\t" + 
                               products[2] + "\t" + products[3]);
        }
    }
}

package ProductStockWithMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Warehouse {
    private Map<String, Integer> inventory = new TreeMap<>();

    public void addProduct(String productName, int stock){
        inventory.put(productName, stock);
    }

    public void editStock(String productName,int newStock) {
        if (inventory.containsKey(productName)){
            inventory.put(productName, newStock);
            System.out.println("\n Stock actualizado de "+ productName +": " + inventory.get(productName));
        }else {
            System.out.println("\n El producto no existe...");
        }
    }

    public void showInventory(){
        System.out.println("\n" + inventory);
    }

    public void productsLowOnStock(){
        System.out.println("\n Productos bajos en stock:");
        for (String product : inventory.keySet()) {
            if (inventory.get(product) < 5){
                System.out.println("- " + product + " (" + inventory.get(product) + " unidades)");
            }
        }

    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("Coco",100);
        warehouse.addProduct("Manzana",80);
        warehouse.addProduct("Banana",110);
        warehouse.addProduct("Uvas",1000);
        warehouse.addProduct("Pera",3);
        System.out.println("\n Inventario de los productos: \n" + warehouse.inventory);

        String searchKey = "Coca";
        int newStock = 50;
        warehouse.editStock(searchKey,newStock);

        warehouse.showInventory();

        warehouse.productsLowOnStock();
    }
}

package InventoryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            Inventory<FoodItem> foodItemInventory = new Inventory<>();
            foodItemInventory foodItem1 = foodItemInventory(100, "Chocolate", 20);
            foodItemInventory foodItem2 = foodItemInventory(150, "Bread", 15);

            foodItemInventory.addItem(foodItem1);
            foodItemInventory.addItem(foodItem2);
            foodItemInventory.displayIventory();

            foodItemInventory.removeItem(1);
            foodItemInventory.displayIventory();


            Inventory<EletronicsItem> eletronicsItemInventory = new Inventory<>();
            EletronicsItem eletronicsItem1 = new EletronicsItem(101, "Laptop", 10);
            EletronicsItem eletronicsItem2 = new EletronicsItem(202, " Phone", 20);

            eletronicsItemInventory.addItem(eletronicsItem1);
            eletronicsItemInventory.addItem(eletronicsItem2);
            eletronicsItemInventory.displayIventory();

            eletronicsItemInventory.removeItem(202);
            eletronicsItemInventory.displayIventory();

        } catch (ItemNotFoundException | InsufficientStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

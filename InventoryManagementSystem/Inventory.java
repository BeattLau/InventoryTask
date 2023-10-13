package InventoryManagementSystem;


import java.util.ArrayList;
import java.util.List;

public class Inventory <T extends Item{
    private static List<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);

    }

    public static void removeItem(int itemId) throws ItemNotFoundException, InsufficientStockException {
       boolean found = false;
       for (T item : items){
           if (item.getId() == itemId) {
               if (item.getQuantity()>0){
                   items.remove(item);
                   found = true;
                   break;
               }else {
                   throw new InsufficientStockException ("Not eunogh item");
               }
           }
    }
       if (!found){
           throw new ItemNotFoundException ("Item not found ")
       }

    }
    public void displayInventory(){
        for (Item item : items){
            System.out.println(item);
        }
    }
}









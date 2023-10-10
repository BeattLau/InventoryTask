package InventoryManagementSystem;


import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private static List<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);

    }

    public static void remove(Item item) {
        items.remove(item);
    }

    public Item search(Item item) throws ItemNotFoundException {
        int index = items.indexOf(item);
        if (index < 0) {
            throw new ItemNotFoundException("Item not found");
        }
        return items.get(index);
    }

    public int insufficientStock(Item item) throws ItemNotFoundException, InsufficientStockException {
        int index = items.indexOf(item);
        if (index < 0) {
            throw new ItemNotFoundException("Item not found");
        }

        int quantity = items.get(index).getQuantity();

        if (quantity <= 0) {
            throw new InsufficientStockException("Insufficient items in stock");
        }

        return quantity;
    }
}









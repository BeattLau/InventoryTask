package InventoryManagementSystem;

public class Item {
    private int id;
    private String name;
    private int quantity;

    public Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public class FoodItem extends Item {
        public FoodItem(int id, String name, int quantity) {
            super(id, name, quantity);
        }
    }

    // ElectronicsItem.java (Subclass)
    public class ElectronicsItem extends Item {
        public ElectronicsItem(int id, String name, int quantity) {
            super(id, name, quantity);
        }

    }
}

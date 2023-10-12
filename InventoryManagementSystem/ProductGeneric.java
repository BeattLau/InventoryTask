package InventoryManagementSystem;
import org.apache.commons.lang.StringUtils;
public class ProductGeneric <T, U, V> {

    private T id;
    private U name;
    private V quantity;

    public ProductGeneric(T id, U name, V quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public T getId(T id) {
        return id;
    }

    public U getName(U name) {
        return name;
    }

    public V getQuantity(V quantity) {
        return quantity;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setName(U name) {
        this.name = name;
    }

    public void setQuantity(V quantity) {
        this.quantity = quantity;
    }





}


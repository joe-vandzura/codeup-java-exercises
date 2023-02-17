package grocerylist;

import java.util.ArrayList;

public class Grocery {

    private String name;
    private String category;
    private int quantity;

    public Grocery(String name, String category, int quantity) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    // accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Inventory> inventory = new ArrayList<Inventory>();

    public Inventory(ArrayList<Inventory> inventory) {
        this.inventory = inventory;
    }

    public ArrayList<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Inventory> inventory) {
        this.inventory = inventory;
    }

    
}

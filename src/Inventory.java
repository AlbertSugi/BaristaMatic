


import java.util.HashMap;


public class Inventory<Ingredients> { //a Hashmap to contain Inventories of Ingredients
    private HashMap<Ingredients, Integer> inventory = new HashMap<Ingredients, Integer>();


    public int getQuantity(Ingredients item){
        return inventory.get(item);
    }


    public void restock() {
        for (Ingredients item : inventory.keySet()) {
            inventory.put(item,10);
        }
    }

    public void deduct(Ingredients item,int usage) {
        if (hasItem(item,usage)) {
            int count = inventory.get(item);
            if(count<usage){ inventory.put(item, 0);}
            else {inventory.put(item, count - usage);}

        }
    }

    public boolean hasItem(Ingredients item, int numberneeded){
        return(getQuantity(item) >= numberneeded);
        }


    public void put(Ingredients item, int quantity) {
        inventory.put(item, quantity);
    }

}



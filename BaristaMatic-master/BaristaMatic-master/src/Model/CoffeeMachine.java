package Model;
import java.util.ArrayList;
import java.util.EnumSet;

import DAO.Inventory;

public class CoffeeMachine { //Everything needed to produce the selected drinks
    private static Inventory<Ingredients> ingdnt = new Inventory<Ingredients>();
    private EnumSet<Drink> Drinklist = EnumSet.allOf( Drink.class );

    public  void initialize(){
        for(Ingredients c : Ingredients.values()){
            ingdnt.put(c, 10);
        }



    }

    public String printIngredients() {
    	String Inventory = "Inventory:\r\n";
        for (Ingredients t : Ingredients.values()) {
            if(!t.equals(Ingredients.none)){
                Inventory = Inventory +(t.getName()+","+ingdnt.getQuantity(t)+"\n");
            }
        }
        return Inventory;
    }
    public String printDrinks(){
    	String Drinks = "";
        System.out.println("Menu:");
        for(Drink c : Drink.values()){
            Drinks =Drinks +(c.getDrinkId()+","+c.getDrinkName()+","+"$"+c.Drinkprice()+","+availability(c)+"\n");
        
        }
        return Drinks;
    }

    public void Restock(){
        ingdnt.restock();
    }
    public void Exit(){
        System.exit(0);

    }
    private boolean availability(Drink q){
                return ingdnt.hasItem(q.ingredient1(),q.getNeeded1())&&ingdnt.hasItem(q.ingredient2(),
                        q.getNeeded2())&&ingdnt.hasItem(q.ingredient3(),q.getNeeded3())&&ingdnt.hasItem(q.ingredient4(),q.getNeeded4());
                }




    public void orderdrink(Drink t) {
        if(availability(t)){
            System.out.println("Dispensing:"+t.getDrinkName());
            ingdnt.deduct(t.ingredient1(),t.getNeeded1());
            ingdnt.deduct(t.ingredient2(),t.getNeeded2());
            ingdnt.deduct(t.ingredient3(),t.getNeeded3());
            ingdnt.deduct(t.ingredient4(),t.getNeeded4());
        }
        else{
            System.out.println("Out of stock:"+t.getDrinkName());
        }

    }

    public Drink getDrinkByID(String id) {
        for (Drink d: Drinklist) {
            if (d.getDrinkId().equals(id)) return d;
        }
        return null;
    }
    public ArrayList<String> getIDs()
    {
        ArrayList<String> ids = new ArrayList<>();
        for (Drink d: Drinklist) {
            ids.add(d.getDrinkId());
        }
        return ids;
    }


}

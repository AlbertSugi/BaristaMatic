import java.util.ArrayList;
import java.util.EnumSet;

public class CoffeeMachine { //Everything needed to produce the selected drinks
    private static Inventory<Ingredients> ingdnt = new Inventory<Ingredients>();
    private EnumSet<Drink> Drinklist = EnumSet.allOf( Drink.class );

    public  void initialize(){
        for(Ingredients c : Ingredients.values()){
            ingdnt.put(c, 10);
        }



    }

    public void printIngredients() {
        System.out.println("Inventory:");
        for (Ingredients t : Ingredients.values()) {
            if(!t.equals(Ingredients.none)){
                System.out.println(t.getName()+","+ingdnt.getQuantity(t));
            }
        }
    }
    public void printDrinks(){
        System.out.println("Menu:");
        for(Drink c : Drink.values()){
            System.out.println(c.getDrinkId()+","+c.getDrinkName()+","+"$"+c.Drinkprice()+","+CoffeeMachine.availability(c));
        }
    }

    public void Restock(){
        ingdnt.restock();
    }
    public void Exit(){
        System.exit(0);

    }
    private static boolean availability(Drink q){
                return ingdnt.hasItem(q.ingredient1(),q.getNeeded1())&&ingdnt.hasItem(q.ingredient2(),
                        q.getNeeded2())&&ingdnt.hasItem(q.ingredient3(),q.getNeeded3())&&ingdnt.hasItem(q.ingredient4(),q.getNeeded4());
                }




    public void orderdrink(Drink t) {
        if(CoffeeMachine.availability(t)){
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

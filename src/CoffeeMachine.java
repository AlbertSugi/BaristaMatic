import java.util.ArrayList;
import java.util.EnumSet;

public class CoffeeMachine { //Everything needed to produce the selected drinks
    private static Inventory<Ingredients> ingdnt = new Inventory<Ingredients>();
    private static EnumSet<Drink> Drinklist = EnumSet.allOf( Drink.class );

    public static void initialize(){
        for(Ingredients c : Ingredients.values()){
            ingdnt.put(c, 10);
        }



    }

    public static void printIngredients() {
        System.out.println("Inventory:");
        for (Ingredients t : Ingredients.values()) {
            if(!t.equals(Ingredients.none)){
                System.out.println(t.getName()+","+ingdnt.getQuantity(t));
            }
        }
    }
    public static void printDrinks(){
        System.out.println("Menu:");
        for(Drink c : Drink.values()){
            System.out.println(c.getDrinkId()+","+c.getDrinkName()+","+"$"+c.Drinkprice()+","+CoffeeMachine.availability(c));
        }
    }

    public static void Restock(){
        ingdnt.restock();
    }
    public static void Exit(){
        System.exit(0);

    }
    private static boolean availability(Drink q){
                return ingdnt.hasItem(q.ingredient1(),q.getNeeded1())&&ingdnt.hasItem(q.ingredient2(),
                        q.getNeeded2())&&ingdnt.hasItem(q.ingredient3(),q.getNeeded3())&&ingdnt.hasItem(q.ingredient4(),q.getNeeded4());
                }




    public static void orderdrink(Drink t) {
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

    public static Drink getDrinkByID(String id) {
        for (Drink d: Drinklist) {
            if (d.getDrinkId().equals(id)) return d;
        }
        return null;
    }
    public static ArrayList<String> getIDs()
    {
        ArrayList<String> ids = new ArrayList<>();
        for (Drink d: Drinklist) {
            ids.add(d.getDrinkId());
        }
        return ids;
    }


}

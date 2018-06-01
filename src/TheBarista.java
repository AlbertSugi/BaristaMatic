import java.util.Scanner;



public class TheBarista {


    public static void main(String[] args) {
        CoffeeMachine.initialize();
        TheBarista.Baristastart();
        }


    private static String Baristastart() {
        CoffeeMachine.printIngredients();
        CoffeeMachine.printDrinks();
        Scanner input = new Scanner(System.in);
        String reader = input.next();
        if (reader.equals("r") || reader.equals("R")) {
            CoffeeMachine.Restock();
            return Baristastart();
        }
        else if (reader.equals("q") || reader.equals("Q")) {
            CoffeeMachine.Exit();
        }
        else if (reader.equals("")||(reader.equals(" ")) ){
            return Baristastart();
        }
        else if (CoffeeMachine.getIDs().contains(reader)){
            CoffeeMachine.orderdrink(CoffeeMachine.getDrinkByID(reader));
            return Baristastart();
        }
         System.out.println("Invalid selection:"+reader);
        return Baristastart();

    }

}

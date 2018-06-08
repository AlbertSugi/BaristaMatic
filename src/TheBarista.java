import java.util.Scanner;



public class TheBarista {


    public static void main(String[] args) {
        CoffeeMachine Coffee = new CoffeeMachine();
        TheBarista Barista = new TheBarista();
        Coffee.initialize();
        Barista.Baristastart();
        }


    private String Baristastart() {
        CoffeeMachine Coffee = new CoffeeMachine();
        Coffee.printIngredients();
        Coffee.printDrinks();
        Scanner input = new Scanner(System.in);
        String reader = input.next();
        if (reader.equals("r") || reader.equals("R")) {
            Coffee.Restock();
            return Baristastart();
        }
        else if (reader.equals("q") || reader.equals("Q")) {
            Coffee.Exit();
        }
        else if (reader.equals("")||(reader.equals(" ")) ){
            return Baristastart();
        }
        else if (Coffee.getIDs().contains(reader)){
            Coffee.orderdrink(Coffee.getDrinkByID(reader));
            return Baristastart();
        }
         System.out.println("Invalid selection:"+reader);
        return Baristastart();

    }

}

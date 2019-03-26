package View;

import java.util.Scanner;

import Model.CoffeeMachine;



public class TheBarista {

    CoffeeMachine Coffee = new CoffeeMachine();



    public static void main(String[] args) {
        TheBarista Barista = new TheBarista();
        Barista.initialize();
        Barista.Baristastart();
        }


    private String Baristastart() {
        System.out.println(Coffee.printIngredients());
        System.out.println(Coffee.printDrinks());
        System.out.println("press number to order, r to restock and q to exit");
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

    private void initialize(){
        Coffee.initialize();
    }

}

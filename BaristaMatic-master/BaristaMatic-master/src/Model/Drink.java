package Model;
import java.text.DecimalFormat;

public enum Drink { //Input Drinks and their ingredients here!

    CafeAmericano("1","Caffe Americano",Ingredients.espresso,3,Ingredients.none,0,Ingredients.none,0,Ingredients.none,0),
    CafeLatte("2","Caffe Latte",Ingredients.espresso,2,Ingredients.steammilk,1,Ingredients.none,0,Ingredients.none,0),
    CafeMocha("3","Caffe Mocha",Ingredients.espresso,1,Ingredients.cocoa,1,Ingredients.steammilk,1,Ingredients.whippedcream,1),
    Cappuccino("4","Cappucino",Ingredients.espresso,2,Ingredients.steammilk,1,Ingredients.foamedmilk,1,Ingredients.none,0),
    Coffee("5","Coffee", Ingredients.coffee,3, Ingredients.sugar,1,Ingredients.cream,1,Ingredients.none,0),
    DecafCoffee("6","Decaf Coffee",Ingredients.decafcoffee,3,Ingredients.sugar,1,Ingredients.cream,1,Ingredients.none,0);






    private String names;
    private String id;
    private Ingredients ingredients1;
    private Ingredients ingredients2;
    private Ingredients ingredients3;
    private Ingredients ingredients4;

    private int needed1;
    private int needed2;
    private int needed3;
    private int needed4;



    Drink(String id,String name, Ingredients ingredients1, int needed1, Ingredients ingredients2,int needed2, Ingredients ingredients3, int needed3, Ingredients ingredients4, int needed4) {
        this.id= id;
        this.names = name;
        this.needed1=needed1;
        this.ingredients1=ingredients1;
        this.needed2=needed2;
        this.ingredients2=ingredients2;
        this.needed3=needed3;
        this.ingredients3=ingredients3;
        this.needed4=needed4;
        this.ingredients4=ingredients4;


    }
    public String getDrinkName(){
        return names ;
    }

    public String Drinkprice(){
        DecimalFormat f = new DecimalFormat("##.00");
        double price =(((ingredients1.getPrice())*needed1)+(ingredients2.getPrice()*needed2)+(ingredients3.getPrice()*needed3)+(ingredients4.getPrice()*needed4));
            return f.format(price);
    }

    public String getDrinkId(){
        return id;
    }
    public Ingredients ingredient1(){
        return ingredients1;
    }
    public Ingredients ingredient2(){
        return ingredients2;
    }
    public Ingredients ingredient3(){
        return ingredients3;
    }
    public Ingredients ingredient4(){
        return ingredients4;
    }
    public int getNeeded1(){
        return needed1;
    }public int getNeeded2(){
        return needed2;
    }public int getNeeded3(){
        return needed3;
    }public int getNeeded4(){
        return needed4;
    }



}

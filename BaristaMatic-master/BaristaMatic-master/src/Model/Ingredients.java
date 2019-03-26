package Model;

public enum Ingredients {
    cocoa("Cocoa",0.90),
    coffee("Coffee",0.75),
    cream("Cream",0.25),
    decafcoffee("Decaf Coffee",0.75),
    espresso("Espresso",1.10),
    foamedmilk("Foamed Milk",0.35),
    steammilk("Steamed Milk",0.35),
    sugar("Sugar",0.25),
    whippedcream("Whipped Cream",1.00),
    none("null",0);


    private String name;
    private double price;

    Ingredients(String name, double price){
        this.name=name;
        this.price=price;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    


}

package factoryPattern.pizzas;

import factoryPattern.Pizza;

public class ChicagoStyleClamPizza extends Pizza{
	
	public ChicagoStyleClamPizza(){
		name = "Chicago Style Sauce and Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Clam");
	}

}

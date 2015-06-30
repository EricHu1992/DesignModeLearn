package factoryPattern.pizzas;

import factoryPattern.Pizza;

public class NYStyleVeggiePizza extends Pizza{
	
	public NYStyleVeggiePizza(){
		name = "NY Style Sauce and Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Veggie");
	}

}

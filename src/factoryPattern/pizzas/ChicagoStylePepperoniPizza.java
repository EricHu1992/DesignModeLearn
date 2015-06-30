package factoryPattern.pizzas;

import factoryPattern.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza{
	
	public ChicagoStylePepperoniPizza(){
		name = "Chicago Style Sauce and Pepperoni Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.add("Pepperoni");
	}

}

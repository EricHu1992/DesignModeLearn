package factoryPattern.stores;

import factoryPattern.Pizza;
import factoryPattern.PizzaStore;
import factoryPattern.pizzas.NYStyleCheesePizza;
import factoryPattern.pizzas.NYStyleClamPizza;
import factoryPattern.pizzas.NYStylePepperoniPizza;
import factoryPattern.pizzas.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String pizzaName) {
		if(pizzaName.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(pizzaName.equals("veggie")){
			return new NYStyleVeggiePizza();
		}else if(pizzaName.equals("clam")){
			return new NYStyleClamPizza();
		}else if(pizzaName.equals("pepperoni")){
			return new NYStylePepperoniPizza();
		}else{
			return null;
		}
		
	}
	
	

}

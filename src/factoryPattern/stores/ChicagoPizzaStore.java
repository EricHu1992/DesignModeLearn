package factoryPattern.stores;

import factoryPattern.Pizza;
import factoryPattern.PizzaStore;
import factoryPattern.pizzas.ChicagoStyleCheesePizza;
import factoryPattern.pizzas.ChicagoStyleClamPizza;
import factoryPattern.pizzas.ChicagoStylePepperoniPizza;
import factoryPattern.pizzas.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String pizzaName) {
		if(pizzaName.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else if(pizzaName.equals("veggie")){
			return new ChicagoStyleVeggiePizza();
		}else if(pizzaName.equals("clam")){
			return new ChicagoStyleClamPizza();
		}else if(pizzaName.equals("pepperoni")){
			return new ChicagoStylePepperoniPizza();
		}else{
			return null;
		}
	}

}

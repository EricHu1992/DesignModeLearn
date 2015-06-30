package factoryPattern;

import java.util.ArrayList;

public class Pizza {
	
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList toppings = new ArrayList();
	
	public void prepare(){
		
	}
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return name;
	}
	
	
	
}

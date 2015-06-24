package decoratorPattern;

import decoratorPattern.beverages.Beverage;
import decoratorPattern.beverages.DarkRoast;
import decoratorPattern.beverages.Espresso;
import decoratorPattern.beverages.HouseBlend;
import decoratorPattern.decorator.Mocha;
import decoratorPattern.decorator.Soy;
import decoratorPattern.decorator.Whip;

public class StarbuzzCoffee {
	
	public static void main(String args[]){
		
		Beverage beverage = new Espresso();
		showCost(beverage);
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		showCost(beverage2);
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		showCost(beverage3);
		
	}
	
	private static void showCost(Beverage beverage){
		System.out.println(beverage.getDescription() + "cost $" +beverage.cost()+";");
	}
	
}

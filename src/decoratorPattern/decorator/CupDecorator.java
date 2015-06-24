package decoratorPattern.decorator;

import decoratorPattern.beverages.Beverage;

public abstract class CupDecorator extends Beverage{
	
	public abstract String getDescription();
	
}

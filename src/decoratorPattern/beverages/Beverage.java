package decoratorPattern.beverages;

public abstract class Beverage {
	
	public String description = "unKnown Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
	
}

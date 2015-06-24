package decoratorPattern.decorator;

import decoratorPattern.beverages.Beverage;
/**
 * 调料装饰者
 * 继承被装饰类
 * @author HuBin
 *
 */
public abstract class CondimentDecorator extends Beverage {
	
	public abstract String getDescription();

}

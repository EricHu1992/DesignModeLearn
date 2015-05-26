package designModeStart;

public class TomDuck extends Duck{

	public TomDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	void display() {
		System.out.println("黄色鸭子");
	}
	
}

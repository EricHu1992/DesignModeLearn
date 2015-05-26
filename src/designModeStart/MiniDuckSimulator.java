package designModeStart;

public class MiniDuckSimulator {

	public static void main(String[] args){
		Duck duck = new TomDuck();
		duck.display();
		duck.swim();
		duck.performFly();
		duck.performQuack();
		duck.setFlyBehavior(new FlyWithRocket());
		duck.performFly();
	}
	
}

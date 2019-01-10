package strategy;

public class MallardDuckDuckling extends Duck {

	MallardDuckDuckling() {
		name = "Mallard Duckling";
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
		swimBehavior = new SwimLearningHow();
	}

	public void display() {
		System.out.println("I'm a baby Mallard duck");
	}
}

// @library annotation
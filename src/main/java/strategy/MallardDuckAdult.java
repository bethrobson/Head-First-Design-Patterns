package strategy;

public class MallardDuckAdult extends Duck {

    public MallardDuckAdult() {
        name = "Fully grown Mallard Duck";
        quackBehavior = new Quack();
        flyBehavior = new FlyLongDistance();
        swimBehavior = new SwimForReal();

    }

    void display() {
            System.out.println("I'm a grown Mallard duck");

    }
}

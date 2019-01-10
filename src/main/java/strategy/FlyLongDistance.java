package strategy;

public class FlyLongDistance implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly well enough to migrate.");
    }
}

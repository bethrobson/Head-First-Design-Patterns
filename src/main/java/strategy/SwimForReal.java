package strategy;

public class SwimForReal implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("I have learned how to swim.");
    }
}

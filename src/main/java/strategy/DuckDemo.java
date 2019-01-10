package strategy;

public abstract class DuckDemo {

    abstract Duck createDuck(String stage);

    public Duck demoDuck(String stage){
        Duck duck = createDuck(stage);
        System.out.println("\n--- Creating a " + duck.getDuckName() + " ---");
        duck.display();
        duck.performQuack();
        duck.performSwim();
        duck.performFly();
        return duck;

    }



}

package decorator.starbuzzWithSizes;

public class Cinnamon extends CondimentDecorator {

    public Cinnamon(Beverage beverage){
        this.beverage=beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " with Cinnamon";
    }

    public double cost() {
        return beverage.cost() + .25;
    }


}

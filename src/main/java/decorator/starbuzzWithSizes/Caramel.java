package decorator.starbuzzWithSizes;

public class Caramel extends CondimentDecorator {

    public Caramel(Beverage beverage){
        this.beverage=beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", with Caramel" ;
    }

    public double cost() {

        return beverage.cost() + 1.50;
    }
}

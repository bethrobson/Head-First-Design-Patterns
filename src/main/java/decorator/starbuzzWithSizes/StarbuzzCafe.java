package decorator.starbuzzWithSizes;


public class StarbuzzCafe {

    public static void main(String args[]){

        Beverage beverage = new Decaf();

        System.out.println("Plain beverage: 	 " + beverage.getDescription()
                + " $" + String.format("%.2f", beverage.cost()));

        beverage = new Mocha (
                new Milk(
                        new Caramel(beverage)
                )
        );

        System.out.println(beverage.getDescription()
                + " Decorated beverage $" + beverage.cost());


    }

}

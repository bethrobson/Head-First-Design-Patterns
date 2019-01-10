package factory.pizzafm;

public class PizzaOrderingApp {

    public static void main(String[] args) {
        PizzaStore caliPizzaStore = new CaliPizzaStore();

        Pizza pizza = caliPizzaStore.orderPizza("cheese");
        System.out.println("Hey, you ordered a " + pizza.getName()+"!");

    }
}

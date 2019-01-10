package factory.pizzafm;

public class CaliPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new CaliStyleCheesePizza();
        }
        else if (item.equals("veggie")){
            return new CaliStyleVeggiePizza();
        }

        else {
            return null;
        }

    }
}

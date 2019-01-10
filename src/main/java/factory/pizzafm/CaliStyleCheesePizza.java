package factory.pizzafm;

public class CaliStyleCheesePizza extends Pizza {

    public CaliStyleCheesePizza() {
        name = "Cali Style Feta Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Copious Feta Cheese");
    }

    void bake(){
        System.out.println("Baking for 20 minutes @ 375°");
    }

}

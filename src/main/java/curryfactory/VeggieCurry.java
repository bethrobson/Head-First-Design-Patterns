package curryfactory;

public class VeggieCurry extends Curry {

    CurryIngredientsFactory curryIngredientsFactory;

    VeggieCurry(CurryIngredientsFactory curryIngredientsFactory){
        this.curryIngredientsFactory=curryIngredientsFactory;
    }

    void prepare() {

        carb=curryIngredientsFactory.getCarb();
        sauce=curryIngredientsFactory.getSauce();
        veggies=curryIngredientsFactory.getVeggies();
        toppings=curryIngredientsFactory.getToppings();

    }
}

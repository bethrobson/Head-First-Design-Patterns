package curryfactory;

public class PlainCurry extends Curry {

    CurryIngredientsFactory curryIngredientsFactory;

    PlainCurry(CurryIngredientsFactory curryIngredientsFactory){
        this.curryIngredientsFactory=curryIngredientsFactory;
    }

    void prepare() {

        carb=curryIngredientsFactory.getCarb();
        sauce=curryIngredientsFactory.getSauce();
        veggies=curryIngredientsFactory.getVeggies();
        toppings=curryIngredientsFactory.getToppings();

    }
}

package curryfactory;

public class MeatCurry extends Curry {

    CurryIngredientsFactory curryIngredientsFactory;

    MeatCurry(CurryIngredientsFactory curryIngredientsFactory){
        this.curryIngredientsFactory=curryIngredientsFactory;
    }

    void prepare() {
        carb=curryIngredientsFactory.getCarb();
        sauce=curryIngredientsFactory.getSauce();
        meat=curryIngredientsFactory.getMeat();
        veggies=curryIngredientsFactory.getVeggies();
        toppings=curryIngredientsFactory.getToppings();

    }
}

package curryfactory;

public interface CurryIngredientsFactory {

    Carb getCarb();
    Sauce getSauce();
    Meat getMeat();
    Veggies[] getVeggies();
    Toppings[] getToppings();

}

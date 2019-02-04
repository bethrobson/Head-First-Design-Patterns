package curryfactory;

public class CurryIngredientsFactoryImpl implements CurryIngredientsFactory {
    @Override
    public Carb getCarb() {
        return null;
    }

    @Override
    public Sauce getSauce() {
        return null;
    }

    @Override
    public Meat getMeat() {
        return null;
    }

    @Override
    public Veggies[] getVeggies() {
        return new Veggies[0];
    }

    @Override
    public Toppings[] getToppings() {
        return new Toppings[0];
    }
}

package curryfactory;

public class MiaStyleIngredientsFactory implements CurryIngredientsFactory {
    @Override
    public Carb getCarb() {
        return new Udon();
    }

    @Override
    public Sauce getSauce() {
        return new KaraKuchi();
    }

    @Override
    public Meat getMeat() {
        return new ChickenOnBone();
    }

    @Override
    public Veggies[] getVeggies() {
        Veggies[] veggies = {new Mushroom(),new Onion(), new Garlic(), new Potato(),new Spinach()};
        return veggies;
    }

    @Override
    public Toppings[] getToppings() {
        Toppings[] toppings = {new Tsukemono(),new Umeboshi(), new Kimchi()};
        return toppings;
    }
}

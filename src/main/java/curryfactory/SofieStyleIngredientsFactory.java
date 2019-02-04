package curryfactory;

public class SofieStyleIngredientsFactory implements CurryIngredientsFactory {
    @Override
    public Carb getCarb() {
        return new WhiteRice();
    }

    @Override
    public Sauce getSauce() {
        return new AmaKuchi();
    }

    @Override
    public Meat getMeat() {
        return new DicedBeef();
    }

    @Override
    public Veggies[] getVeggies() {
        Veggies [] veggies = {new Spinach(), new Broccoli(), new Onion(), new Garlic(), new Eggplant(), new Potato()};
        return new Veggies[0];
    }

    @Override
    public Toppings[] getToppings() {

        Toppings[] toppings = {new Tsukemono(), new Umeboshi(), new SourCream()};
        return new Toppings[0];
    }
}

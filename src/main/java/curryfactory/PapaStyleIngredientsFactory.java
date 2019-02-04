package curryfactory;

public class PapaStyleIngredientsFactory implements CurryIngredientsFactory {

    public Carb getCarb() {
        return new WhiteRice();
    }
    public Sauce getSauce() {
        return new Ookara();
    }

    public Meat getMeat() {
        return new ChickenDiced();
    }

    public Veggies[] getVeggies() {
        Veggies[] veggies = {new Potato(), new Mushroom(), new Garlic(), new Onion(), new Cauliflower()};
        return veggies;
    }

    public Toppings[] getToppings() {

        Toppings[] toppings ={new Tsukemono()};
        return toppings;
    }
}

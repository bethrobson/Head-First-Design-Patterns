package curryfactory;

public abstract class Curry {

    String name;

    Carb carb;
    Sauce sauce;
    Meat meat;
    Veggies[] veggies;
    Toppings[] toppings;


    abstract void prepare();

    void saute(){
        System.out.println("Saute meat, add veggies and sauce, drain and cover.");
    }
    void cook(){
        System.out.println("Simmer on low heat for 1 hour. Do not lift lid!");
    }
    void cool(){
        System.out.println("Let sit on stove the rest of day.");
    }
    void serve(){
        System.out.println("Add toppings and serve.");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String toString(){

        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (carb != null) {
            result.append(carb);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }

        if (meat != null) {
            result.append(meat);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }

        if (toppings != null) {
            for (int i = 0; i < toppings.length; i++) {
                result.append(toppings[i]);
                if (i < toppings.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }

        return result.toString();

    }





}

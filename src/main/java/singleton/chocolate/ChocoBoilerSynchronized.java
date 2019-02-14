package singleton.chocolate;

public class ChocoBoilerSynchronized {

    private boolean empty;
    private boolean boiled;
    private static ChocoBoilerSynchronized uniqueInstance;

    private ChocoBoilerSynchronized() {
        empty = true;
        boiled = false;
    }

    public static ChocoBoilerSynchronized getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocoBoilerSynchronized();
        }else{
            System.out.println("Returning existing instance of Chocolate Boiler");
        }

        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("Filling the boiler with a milk/chocolate mixture.");
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Draining the boiled milk and chocolate");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("Bringing the boiled milk and chocolate to a boil.");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }



}

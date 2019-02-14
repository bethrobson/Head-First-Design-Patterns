package singleton.chocolate;

import java.util.concurrent.*;

public class ChocolateControllerMultithreaded {
    public static void main(String args[]) {
        int orders = 100;
        ExecutorService executor= Executors.newFixedThreadPool(orders);

        try{
            for (int i=0; i < orders; i++){
                executor.execute(() -> orderChocolate());
            }
        }catch(Exception err){
            err.printStackTrace();
        }
        executor.shutdown();

    }

    private static void orderChocolate(){
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

    }

}
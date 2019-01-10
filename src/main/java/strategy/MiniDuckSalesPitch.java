package strategy;


// why are we doing this? To ensure a consistent demo experience.

public class MiniDuckSalesPitch {

    public static void main(String[] args) {
        DuckDemo mallardDemo = new MallardDuckDemo();
        Duck duck = mallardDemo.demoDuck("duckling");
        System.out.println("That was a " + duck.getDuckName());

        duck= mallardDemo.demoDuck("adult");
        System.out.println("That was a " + duck.getDuckName());

    }


}

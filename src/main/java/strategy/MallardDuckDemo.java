package strategy;

public class MallardDuckDemo extends DuckDemo {
    @Override
    Duck createDuck(String stage) {
        switch (stage) {
            case "duckling":
                return new MallardDuckDuckling();
            case "adult":
                return new MallardDuckAdult();
            default:
                return null;
        }
    }
}

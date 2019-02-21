package curryfactory;

public abstract class CurryKitchen {

    abstract Curry prepareCurry(String type);



    Curry orderCurry (String item){
        Curry curry = prepareCurry(item);
        return curry;
    }

}

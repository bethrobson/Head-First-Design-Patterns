package builder.pizza;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    public enum Topping {MUSHROOM, ONION, PEPPER, GARLIC, SPINACH}

    final Set<Topping> toppings;

    abstract static class Builder<E extends Builder<E>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public E addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza Build();

        protected abstract E self();

    }

    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }

}

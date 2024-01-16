package toppings;

import baseClasses.BasePizza;
import baseClasses.ToppingDecorator;

public class ExtraVegisTopping extends ToppingDecorator {
    private BasePizza basePizza;
    private Integer extraVegisPrice = 5;

    public ExtraVegisTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Integer getPrice() {
        return basePizza.getPrice() + extraVegisPrice;
    }
}

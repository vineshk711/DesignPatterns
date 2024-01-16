package toppings;

import baseClasses.BasePizza;
import baseClasses.ToppingDecorator;


public class ExtraCheeseTopping extends ToppingDecorator {

    private BasePizza basePizza;
    private Integer extraCheeasePrice = 10;

    public ExtraCheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public Integer getPrice() {
       return basePizza.getPrice() + extraCheeasePrice;
    }
    
}
package pizza;

import baseClasses.BasePizza;

public class VegDelightPizza extends BasePizza { 

    private Integer vegDelightPizzaPrice = 100;

    @Override
    public Integer getPrice() {
        return vegDelightPizzaPrice;
    }
    
}

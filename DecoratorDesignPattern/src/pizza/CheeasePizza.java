package pizza;

import baseClasses.BasePizza;

public class CheeasePizza extends BasePizza {

    private Integer cheeeasePizzaPrice = 150;

    @Override
    public Integer getPrice() {
        return cheeeasePizzaPrice;
    }
    
}

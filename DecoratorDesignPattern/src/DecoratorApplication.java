import baseClasses.BasePizza;
import pizza.CheeasePizza;
import pizza.VegDelightPizza;
import toppings.ExtraCheeseTopping;
import toppings.ExtraVegisTopping;

public class DecoratorApplication {
    public static void main(String[] args) {
        
        // I want a cheease pizza with extra cheease

        BasePizza cheeasePizza = new ExtraCheeseTopping(new CheeasePizza());
        System.out.println("Your price for cheease pizza with extra Cheease is: " + cheeasePizza.getPrice());

         // I want a cheease pizza with extra cheease and vegies

         BasePizza cheeasePizzaWithExtraVegies = new ExtraVegisTopping( new ExtraCheeseTopping( new CheeasePizza()));
         System.out.println("Your price for cheease pizza with extra Cheease and Vegies is: " + cheeasePizzaWithExtraVegies.getPrice());

           // I want a vegis pizza with extra cheease

           BasePizza vegiesPizzaWithExtraCheease=  new ExtraCheeseTopping( new VegDelightPizza());
           System.out.println("Your price for Vegies pizza with extra Cheease is: " + vegiesPizzaWithExtraCheease.getPrice());
    }
}
package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Pizza.BasePizza;

public class ExtraCheese extends Topping{
    BasePizza pizza;
    public ExtraCheese(BasePizza pizza)
    {
        this.pizza=pizza;
    }

    @Override
    public int PizzaCost() {
        return pizza.PizzaCost()+120;
    }
}

package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Pizza.BasePizza;

public class Mushroom extends Topping{
    BasePizza pizza;
    public Mushroom(BasePizza pizza)
    {
        this.pizza=pizza;
    }

    @Override
    public int PizzaCost() {
        return pizza.PizzaCost()+11;
    }
}

package DecoratorDesignPattern.Toppings;

import DecoratorDesignPattern.Pizza.BasePizza;

public class Jalapeno extends Topping {
    BasePizza pizza;
    public Jalapeno(BasePizza pizza)
    {
        this.pizza=pizza;
    }

    @Override
    public int PizzaCost() {
        return pizza.PizzaCost()+10;
    }
}

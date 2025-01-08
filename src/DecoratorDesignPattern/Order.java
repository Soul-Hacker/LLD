package DecoratorDesignPattern;

import DecoratorDesignPattern.Pizza.BasePizza;
import DecoratorDesignPattern.Pizza.Marg;
import DecoratorDesignPattern.Toppings.ExtraCheese;
import DecoratorDesignPattern.Toppings.Jalapeno;

public class Order {
    public static void main(String[] args)
    {
        BasePizza pizza=new Jalapeno(new ExtraCheese(new Marg()));
        System.out.println(pizza.PizzaCost());
    }
}

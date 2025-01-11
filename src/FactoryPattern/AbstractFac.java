package FactoryPattern;

public class AbstractFac {
    public static void main(String[] args)
    {
        System.out.println("This is the Abstract Factory");
        ShapeFactory sh=new ShapeFactory();
        Shape sp=sh.getShape("CIRCLE");
        sp.Draw();

    }
}

package de.javacourse._02_constructor_for_object_duck;

public class Main
{
    public static void main(String[] args)
    {
        Duck duck = new Duck("Hans");
        duck.speak();
        duck.speak();

        Duck otherDuck = new Duck("Franz");
        otherDuck.speak();
    }
}

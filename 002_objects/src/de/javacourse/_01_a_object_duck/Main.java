package de.javacourse._01_a_object_duck;

public class Main
{
    public static void main(String[] args)
    {
        Duck duck = new Duck();
        duck.speak();
        duck.speak();

        Duck otherDuck = new Duck();
        otherDuck.speak();
    }
}

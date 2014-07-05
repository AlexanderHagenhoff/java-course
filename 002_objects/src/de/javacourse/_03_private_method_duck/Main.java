package de.javacourse._03_private_method_duck;

public class Main
{
    public static void main(String[] args)
    {
        Duck duck = new Duck("Hans");
        duck.speak();

        Duck duck2 = new Duck();
        duck2.speak();
    }
}

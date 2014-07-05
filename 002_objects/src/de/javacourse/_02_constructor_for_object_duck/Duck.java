package de.javacourse._02_constructor_for_object_duck;

public class Duck
{
    private String pattern = "quack quack";

    private String name;

    public Duck(String name){

        this.name = name;
    }

    public void speak()
    {
        System.out.println("Mein Name ist "+name+" "+this.pattern);
    }
}

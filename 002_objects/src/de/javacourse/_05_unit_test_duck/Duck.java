package de.javacourse._05_unit_test_duck;

public class Duck
{
    private String pattern = "quack quack";

    private String name;

    public Duck()
    {
    }

    public Duck(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPattern(String newPattern){
        this.pattern = newPattern;
    }

    public void speak()
    {
        String sentence = this.getSentence();
        System.out.println(sentence);
    }

    public boolean hasName()
    {
        return (name != null);
    }

    public String getSentence()
    {
        if (hasName()) {
            return "Mein Name ist " + name + " " + this.pattern;
        }

        return "Ich habe keinen Namen " + this.pattern;
    }
}

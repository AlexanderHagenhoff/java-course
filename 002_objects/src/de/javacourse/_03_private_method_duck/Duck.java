package de.javacourse._03_private_method_duck;

public class Duck
{
    private String pattern = "quack quack";

    private String name;

    public Duck(){
    }

    public Duck(String name){
        this.name = name;
    }

    public void speak()
    {
        String sentence = this.getSentence();
        System.out.println(sentence);
    }

    private String getSentence(){
        if (hasName()) {
            return "Mein Name ist " + name + " " + this.pattern;
        }

        return "Ich habe keinen Namen "+this.pattern;
    }

    private boolean hasName(){
        return (name != null);
    }
}

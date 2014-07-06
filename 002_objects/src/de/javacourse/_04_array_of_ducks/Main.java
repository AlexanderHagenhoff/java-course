package de.javacourse._04_array_of_ducks;

public class Main
{
    public static void main(String[] args)
    {
        Duck[] ducks = new Duck[3];
        ducks[0] = new Duck("Hans");
        ducks[1] = new Duck("Franz");
        ducks[2] = new Duck();

        for (int i=0; i<3; i++){
            ducks[i].speak();
            ducks[i].setPattern("Neuer Name "+i);
        }

        for (Duck duck : ducks) {
            duck.speak();
        }
    }
}

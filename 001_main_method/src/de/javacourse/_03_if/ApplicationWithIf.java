package de.javacourse._03_if;

public class ApplicationWithIf
{
    public static void main(String[] args)
    {
        int value = 9;

        if (value < 10) {
            System.out.println("Wert kleiner 10: " + value);
        } else {
            System.out.println("Wert grösser oder gleich 10: " + value);
        }
    }
}

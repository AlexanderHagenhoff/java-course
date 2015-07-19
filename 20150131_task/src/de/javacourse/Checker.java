package de.javacourse;

public class Checker
{
    public boolean isX(int input)
    {
        //modify code here
        if (input <= 2) {
            return (input== 2);
        }
        for (int i = 2; i * i <= input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}

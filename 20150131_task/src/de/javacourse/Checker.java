package de.javacourse;

public class Checker {
    public boolean isX(int input) {
        if (input < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(input); i++) {
            if ((input % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
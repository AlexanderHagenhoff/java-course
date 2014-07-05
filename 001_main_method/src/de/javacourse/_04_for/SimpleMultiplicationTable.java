package de.javacourse._04_for;

public class SimpleMultiplicationTable
{
    public static void main(String[] args)
    {
        for (int y = 0; y <= 10; y++) {
            for (int x = 0; x <= 10; x++) {
                int result = x * y;
                String toPrint = " " + x * y;

                if (result < 10) {
                    toPrint = " " + toPrint;
                }

                System.out.print(toPrint);
            }
            System.out.println();
        }
    }
}

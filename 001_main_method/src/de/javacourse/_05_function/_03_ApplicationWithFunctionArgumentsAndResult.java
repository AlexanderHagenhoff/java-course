package de.javacourse._05_function;

public class _03_ApplicationWithFunctionArgumentsAndResult
{
    public static void main(String[] args)
    {
        int value1 = 10;
        int value2 = 20;

        int result = multiply(value1, value2);

        System.out.println(result);
    }

    private static int multiply(int a, int b)
    {
        return a * b;
    }
}

package Book5.chapter3;

import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number to get factorial: ");
        int n = sc.nextInt();
        Long fact;
        fact = factorial(n);

        System.out.println("Recursive: The factorial of " + n + " is " + recursiveFactorial(n) + ".");

    }

    private static Long factorial(int n)
    {
        long f = 1;
        for(int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }

    private static Long recursiveFactorial(int n)
    {
        if(n == 1)
            return 1L;
        else
            return n * recursiveFactorial(n - 1);
    }
}

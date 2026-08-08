package com.controlflowstatements.loops;

import java.util.Scanner;

public class AlternativePrimeNumbers {

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sin.nextInt();

        int count = 0;

        System.out.println("Alternative Prime Numbers:");

        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) {
                count++;

                if (count % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }

        sin.close();
    }
}
// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound  ===>>  ");
        final int MAX = 1000;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);

    }

    public static void computePrimes(boolean primes[]) {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        // Step 1: Treat all numbers as Prime
        // Write a loop that changes ALL number to prime (true) in the array
        for (int k = 2; k < primes.length; k++) {
            primes[k] = true;

        }
        for (int x = 2; x< primes.length; x++)
        for (int k = x * 2; k < primes.length; k += x) {
            primes[k] = false;

        }

    }
        public static void displayPrimes ( boolean primes[])
        {
            System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
            System.out.println();

            {
                for (int k = 2; k < primes.length; k++) {
                    if (primes[k] == true)
                        System.out.print(k + " ");

                }

            }
        }
    }





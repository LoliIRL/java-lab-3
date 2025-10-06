package main.java.primes;

import java.util.*;

public class PrimesGeneratorTest {
    public static void main(String[] args) {
        int n = 10;
        PrimesGenerator generator = new PrimesGenerator(n);

        System.out.println("Первые " + n + " простых чисел:");

        // Прямой порядок
        System.out.print("Прямой порядок: ");
        for (int prime : generator) {
            System.out.print(prime + " ");
        }
        System.out.println();

        // Обратный порядок через список
        List<Integer> primesList = new ArrayList<>();
        for (int prime : new PrimesGenerator(n)) {
            primesList.add(prime);
        }
        Collections.reverse(primesList);

        System.out.print("Обратный порядок: ");
        for (int prime : primesList) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }
}
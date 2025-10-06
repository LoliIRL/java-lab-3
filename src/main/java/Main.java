
package main.java;

import main.java.collections.CollectionsDemo;
import main.java.collections.WordFrequency;
import main.java.primes.PrimesGeneratorTest;
import main.java.human.HumanDemo;
import main.java.maputils.MapUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ЛАБОРАТОРНАЯ РАБОТА 3 ===");

        System.out.println("\n--- Задание 1: Collections Demo ---");
        CollectionsDemo.main(new String[]{});

        System.out.println("\n--- Задание 2: Primes Generator ---");
        PrimesGeneratorTest.main(new String[]{});

        System.out.println("\n--- Задание 3: Human Collections ---");
        HumanDemo.main(new String[]{});

        System.out.println("\n--- Задание 4: Word Frequency ---");
        WordFrequency.main(new String[]{});

        System.out.println("\n--- Задание 5: Map Utils ---");
        MapUtils.main(new String[]{});
    }
}
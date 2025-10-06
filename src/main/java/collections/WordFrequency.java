package main.java.collections;

import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog. " +
                "The fox is quick and the dog is lazy.";

        Map<String, Integer> frequencyMap = countWordFrequency(text);

        System.out.println("Частота слов в тексте:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.printf("'%s': %d раз(а)\n", entry.getKey(), entry.getValue());
        }
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Разбиваем текст на слова, игнорируя регистр
        String[] words = text.toLowerCase().split("\\W+");

        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return frequencyMap;
    }
}
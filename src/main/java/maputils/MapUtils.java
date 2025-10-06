package main.java.maputils;

import java.util.*;

public class MapUtils {

    /**
     * Меняет местами ключи и значения в Map
     * Если значения повторяются, сохраняется последний ключ
     */
    public static <K, V> Map<V, K> swapKeysAndValues(Map<K, V> originalMap) {
        if (originalMap == null) {
            throw new IllegalArgumentException("Map cannot be null");
        }

        Map<V, K> swappedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : originalMap.entrySet()) {
            swappedMap.put(entry.getValue(), entry.getKey());
        }

        return swappedMap;
    }

    // Тестовый метод
    public static void main(String[] args) {
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("one", 1);
        originalMap.put("two", 2);
        originalMap.put("three", 3);
        originalMap.put("another_one", 1); // Дублирующее значение

        System.out.println("Исходная Map: " + originalMap);

        Map<Integer, String> swappedMap = swapKeysAndValues(originalMap);
        System.out.println("Map после замены: " + swappedMap);
    }
}
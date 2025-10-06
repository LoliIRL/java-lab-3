package main.java.collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // 1. Создаем массив из N случайных чисел
        int n = 15;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101); // 0-100
        }
        System.out.println("1. Исходный массив: " + Arrays.toString(array));

        // 2. Создаем список на основе массива
        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        System.out.println("2. Список: " + list);

        // 3. Сортируем по возрастанию
        Collections.sort(list);
        System.out.println("3. Отсортированный по возрастанию: " + list);

        // 4. Сортируем в обратном порядке
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("4. Отсортированный в обратном порядке: " + list);

        // 5. Перемешиваем список
        Collections.shuffle(list);
        System.out.println("5. Перемешанный список: " + list);

        // 6. Циклический сдвиг на 1 элемент
        Collections.rotate(list, 1);
        System.out.println("6. После циклического сдвига: " + list);

        // 7. Оставляем только уникальные элементы
        List<Integer> uniqueList = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("7. Только уникальные элементы: " + uniqueList);

        // 8. Оставляем только дублирующиеся элементы
        List<Integer> duplicates = findDuplicates(list);
        System.out.println("8. Только дублирующиеся элементы: " + duplicates);

        // 9. Получаем массив из списка
        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("9. Массив из списка: " + Arrays.toString(newArray));

        // 10. Подсчет вхождений каждого числа
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("10. Частоты вхождений: " + frequencyMap);
    }

    private static List<Integer> findDuplicates(List<Integer> list) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : list) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }
}
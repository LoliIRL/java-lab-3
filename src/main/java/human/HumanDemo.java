package main.java.human;

import java.util.*;

public class HumanDemo {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Иван", "Иванов", 25),
                new Human("Петр", "Петров", 30),
                new Human("Анна", "Сидорова", 25),
                new Human("Мария", "Иванова", 22),
                new Human("Алексей", "Петров", 30)
        );

        System.out.println("Исходный список:");
        humans.forEach(System.out::println);

        // HashSet
        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("\nHashSet (порядок не гарантирован):");
        hashSet.forEach(System.out::println);

        // LinkedHashSet
        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\nLinkedHashSet (порядок вставки):");
        linkedHashSet.forEach(System.out::println);

        // TreeSet (естественная сортировка)
        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\nTreeSet (сортировка по Comparable - возраст, фамилия, имя):");
        treeSet.forEach(System.out::println);

        // TreeSet с компаратором по фамилии
        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("\nTreeSet с компаратором по фамилии:");
        treeSetByLastName.forEach(System.out::println);

        // TreeSet с анонимным компаратором по возрасту
        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        treeSetByAge.addAll(humans);
        System.out.println("\nTreeSet с анонимным компаратором по возрасту:");
        treeSetByAge.forEach(System.out::println);

        /* КОММЕНТАРИИ:
        1. HashSet - порядок элементов не гарантирован
        2. LinkedHashSet - сохраняет порядок вставки
        3. TreeSet (естественная сортировка) - сортирует по Comparable
        4. TreeSet с компаратором по фамилии - сортирует только по фамилии
        5. TreeSet с компаратором по возрасту - сортирует только по возрасту
        */
    }
}
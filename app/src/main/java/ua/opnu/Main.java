package ua.opnu;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Завд. 1
        System.out.println("===== Завдання 1 =====");
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println(middleName);
        System.out.println("isPresent: " + middleName.isPresent());
        System.out.println("orElse: " + middleName.orElse("немає"));

        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println(username);
        System.out.println("get(): " + username.get());
        System.out.println("orElse: " + username.orElse("guest"));

        try {
            middleName.get();
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток: " + ex.getMessage());
        }

        try {
            new MyOptional<>(null);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }

        // Завд. 2
        System.out.println("\n===== Завдання 2 =====");
        List<BookData> books = Arrays.asList(
                new BookData("Book A", "Author1", 10, 45),
                new BookData("Book B", "Author2", 5, 25),
                new BookData("Book C", "Author3", 8, 36)
        );
        Collections.sort(books);
        books.forEach(System.out::println);

        // Завд. 3
        System.out.println("\n===== Завдання 3 =====");
        Printer printer = new Printer();
        Integer[] nums = {1, 2, 3};
        String[] strs = {"Hello", "World"};
        printer.printArray(nums);
        printer.printArray(strs);

        // Завд. 4
        System.out.println("\n===== Завдання 4 =====");
        Integer[] numbers = {1, 2, 3, 4, 5, 6};
        Predicate<Integer> even = n -> n % 2 == 0;
        Integer[] evens = FilterUtil.filter(numbers, even);
        System.out.println("Парні: " + Arrays.toString(evens));

        // Завд. 5
        System.out.println("\n===== Завдання 5 =====");
        String[] words = {"one", "two", "three"};
        System.out.println("Містить 'two': " + ArrayUtils.contains(words, "two"));
        System.out.println("Містить 'four': " + ArrayUtils.contains(words, "four"));

        // Завд. 6
        System.out.println("\n===== Завдання 6 =====");
        GenericTwoTuple<String, Integer> tuple1 = new GenericTwoTuple<>("Age", 20);
        GenericThreeTuple<String, Integer, Double> tuple2 =
                new GenericThreeTuple<>("Danilo", 20, 95.5);
        System.out.println(tuple1);
        System.out.println(tuple2);
    }
}

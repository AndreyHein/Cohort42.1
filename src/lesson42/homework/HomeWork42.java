package lesson42.homework;

import lesson42.LibraryBook;
import lesson42.LibraryBookRepository;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 41
 * @author Andrey Hein
 * @version 24-Apr-2024
 */
public class HomeWork42 {
    public static void main(String[] args) {
        // Task #1
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = numbers.stream()
                            .filter(number -> number % 2 == 0)
                            .collect(Collectors.toList());

        List<Integer> oddNumbers = numbers.stream()
                            .filter(n -> n % 2 != 0)
                            .collect(Collectors.toList());

        System.out.println("List of even numbers: " + evenNumbers);
        System.out.println("List of odd numbers:" + oddNumbers);

        // Task #2
        List<String> words = List.of("hEllO", "JaVa", "LAMBDA");

        List<String> updWords = words.stream()
                .map(word ->word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.toList());

        System.out.println("Unconverted list: " + words);
        System.out.println("Converted list: " + updWords);

        // Task #3
        List<String> authors = List.of("Taras Shevchenko", "Ivan Franko", "Lesia Ukrainka",
                "Ivan Nechuy-Levytsky", "Mykhailo Kotsiubynsky", "Panas Myrny", "Pavlo Tychyna");
        LibraryBookRepository repository = new LibraryBookRepository();
        repository.init();
        Collection<LibraryBook> books = repository.values();
        books.forEach(System.out::println);
        for (String author : authors) {
            List<String> authorList = books.stream()
                    .filter(b -> b.getAuthor().equals(author))
                    .map(b -> b.getBookTitle()).collect(Collectors.toList());
            System.out.println("Author: " + author);
            authorList.forEach(System.out::println);
        }
        Set<String> publisher = books.stream()
                .map(b -> b.getPublisher())
                .collect(Collectors.toSet());
        System.out.println("Publisher:");
        publisher.forEach(System.out::println);
    }
}

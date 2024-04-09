package lesson34.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 34
 * @author Andrey Hein
 * @version 09-Apr-2024
 */
public class Task1 {
    public static void main(String[] args) {
        List<Employee> persons = new ArrayList<>(List.of(
            new Employee("Sitter", "Eugen", "driver", "1@gmail.com", "2-14-56", 2500, 45),
            new Employee("Braun", "Andreas", "security", "2@gmail.com", "2-78-98", 1500, 38),
            new Employee("Schmidt", "Laura", "accountant", "3@gmail.com", "2-25-35", 3000, 30),
            new Employee("Schulz", "Waldemar", "security", "4@gmail.com", "2-10-10", 1500, 41),
            new Employee("Wulf", "Viktor", "driver", "5@gmail.com", "2-22-22", 2500, 35)));

        Collections.sort(persons);
        System.out.println("Sorted Employees");
        persons.forEach(System.out::println);

        Comparator<Employee> nameComparator = (e1, e2) -> e1.getLastName().compareTo(e2.getLastName());
        Collections.sort(persons, nameComparator);
        System.out.println(persons);
        // alternative
        Comparator<Employee> nameComparatorAsc = Comparator.comparing(Employee::getLastName);
        Collections.sort(persons, nameComparatorAsc);

        Comparator<Employee> ageComparator = (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge());
        Collections.sort(persons, ageComparator);
        System.out.println(persons);
        // alternative
        Comparator<Employee> ageComparatorAsc = Comparator.comparing(Employee::getAge);
        Collections.sort(persons, ageComparatorAsc);

        Comparator<Employee> ageComparatorDesk = Comparator.comparing(Employee::getAge).reversed();
        Collections.sort(persons, ageComparatorDesk);

        Comparator<Employee> nameAgeComparator = (o1, o2) -> {
            int nameCompare = o1.getLastName().compareTo(o2.getLastName());
            if (nameCompare == 0) {
                return (Integer.compare(o1.getAge(), o2.getAge()));
            }
            return nameCompare;
        };
        Collections.sort(persons, nameAgeComparator);
        persons.forEach(System.out::println);
    }
}

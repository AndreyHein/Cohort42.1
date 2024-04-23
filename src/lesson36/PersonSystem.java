package lesson36;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PersonSystem {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Persons persons = new Persons();

        int id, age;
        String name;
        char operation = 0;
        do {
            System.out.println("Simple personal system:");
            System.out.print("Enter operation ([a]dd, [d]elete , [u]pdate, [p]rint, [f]ind, e[x]it): ");
            operation = scanner.next().charAt(0);
            switch (operation) {
                case 'a':
                    System.out.print("Add: name & age: ");
                    name = scanner.next();
                    age = scanner.nextInt();
                    persons.add(name, age);
                    break;
                case 'd':
                    System.out.print("Delete: id: ");
                    id = scanner.nextInt();
                    persons.delete(id);
                    break;
                case 'u':
                    System.out.print("Update: id & name & age: ");
                    id = scanner.nextInt();
                    name = scanner.next();
                    age = scanner.nextInt();
                    persons.update(id, name, age);
                    break;
                case 'p':
                    System.out.println(persons);
                    break;
                case 'f':
                    System.out.print("Find: id: ");
                    id = scanner.nextInt();
                    System.out.println(persons.find(id));
                    break;
                case 'x':
                    break;
                default:
                    System.out.println("Undefined operation: " + operation);
            }
        } while (operation != 'x');
    }

    static Person findById(List<Person> persons, int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    static void print(List<Person> persons) {
        persons.forEach(System.out::println);
    }
}

package lesson41.eployee.controller;

import lesson41.eployee.domain.Employee;
import lesson41.eployee.repository.EmployeeRepository;

import java.util.List;
import java.util.Scanner;

public class EmployeeUI {
    private EmployeeRepository repository;
    private Scanner scanner;

    public EmployeeUI(EmployeeRepository repository) {
        this.repository = repository;
        this.scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("1. Add person");
        System.out.println("2. Print person");
        System.out.println("3. Update person");
        System.out.println("4. Delete person");
        System.out.println("5. Exit");
    }

    public void run() {
        char cmd;
        do {
            menu();
            System.out.print("Choose an action: ");
            cmd = scanner.nextLine().charAt(0);
            switch (cmd) {
                case '1':
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter the employee's age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the employee's position: ");
                    String position = scanner.nextLine();
                    repository.createEmployee(name, age, position);
                    System.out.println("Employee added.");
                    break;
                case '2':
                    List<Employee> employees = repository.readEmployees();
                    employees.forEach(employee ->
                            System.out.println(employee.getId() + ". " + employee.getName() + " - " +
                                    employee.getAge() + " years old, " + employee.getPosition()));
                    break;
                case '3':
                    System.out.print("Enter the ID of the employee whose information you want to update: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the new employee name (leave blank so as not to change): ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter the new age of the employee (leave 0 so as not to change): ");
                    int newAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter the new employee position (leave blank so as not to change): ");
                    String newPosition = scanner.nextLine();
                    if (newName.isEmpty()) {
                        repository.updateEmployee(id, null, newAge, newPosition);
                    } else {
                        repository.updateEmployee(id, newName, newAge, newPosition);
                    }
                    System.out.println("Employee information has been updated.");
                    break;
                case '4':
                    System.out.print("Enter the ID of the employee you want to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    repository.deleteEmployee(deleteId);
                    System.out.println("The employee has been removed.");
                    break;
                case '5':
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid input. Please select an action from the list.");
            }
        } while (cmd != '5');
    }
}

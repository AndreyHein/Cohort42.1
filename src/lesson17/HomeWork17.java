package lesson17;

public class HomeWork17 {
    public static void main(String[] args) {
        Employee[] personArr = new Employee[5];

        personArr[0] = new Employee("Sitter", "Eugen", "driver", "1@gmail.com", "2-14-56", 2500, 45);
        personArr[1] = new Employee("Braun", "Andreas", "security", "2@gmail.com", "2-78-98", 1500, 38);
        personArr[2] = new Employee("Schmidt", "Laura", "accountant", "3@gmail.com", "2-25-35", 3000, 30);
        personArr[3] = new Employee("Schulz", "Waldemar", "security", "4@gmail.com", "2-10-10", 1500, 41);
        personArr[4] = new Employee("Wulf", "Viktor", "driver", "5@gmail.com", "2-22-22", 2500, 35);

        for (Employee arr : personArr) {
            if (arr.getAge() > 40) {
                arr.printEmployee();
            }
        }
    }
}


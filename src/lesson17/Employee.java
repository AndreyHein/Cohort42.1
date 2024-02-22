package lesson17;

public class Employee {
    private String lastName;
    private String firstName;
    private String job;
    private String email;
    private String telephone;
    private int income;
    private int age;

    public Employee(String lastName, String firstName, String job, String email, String telephone, int income, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.job = job;
        this.email = email;
        this.telephone = telephone;
        this.income = income;
        this.age = age;
    }

    public void printEmployee() {
        System.out.print("Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.print(", Job:" + job);
        System.out.print(", email: " + email);
        System.out.print(", tel:" + telephone);
        System.out.print(", Income: " + income);
        System.out.println(", Age: " + age);
    }

    public int getAge() {
        return age;
    }
}

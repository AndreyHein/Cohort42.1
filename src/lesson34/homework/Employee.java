package lesson34.homework;

public class Employee implements Comparable<Employee>{
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

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Employee p) {
        return lastName.compareTo(p.lastName);
    }

    @Override
    public String toString() {
        return "{" + "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", job='" + job + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", income=" + income +
                ", age=" + age +
                "}\n";
    }
}

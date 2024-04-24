package lesson41.eployee.repository;

import lesson41.eployee.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
    }

    public void createEmployee(String name, int age, String position) {
        Employee employee = new Employee(name, age, position);
        employees.add(employee);
    }

    public List<Employee> readEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            employees.remove(employee);
        }
    }

    public void updateEmployee(int id, String name, int age, String position) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            if (name != null) {
                employee.setName(name);
            }
            if (age > 0) {
                employee.setAge(age);
            }
            if (position != null) {
                employee.setPosition(position);
            }
        }
    }
}
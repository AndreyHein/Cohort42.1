package lesson41.eployee;

import lesson41.eployee.controller.EmployeeUI;
import lesson41.eployee.repository.EmployeeRepository;

public class HomeWork41 {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        EmployeeUI controller = new EmployeeUI(repository);
        controller.run();
    }
}

package lesson41.eployee;

import lesson41.eployee.controller.EmployeeUI;
import lesson41.eployee.repository.EmployeeRepository;

/**
 * AIT-TR, cohort 42.1, Java Basic, hm # 41
 * @author Andrey Hein
 * @version 24-Apr-2024
 */
public class HomeWork41 {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        EmployeeUI controller = new EmployeeUI(repository);
        controller.run();
    }
}

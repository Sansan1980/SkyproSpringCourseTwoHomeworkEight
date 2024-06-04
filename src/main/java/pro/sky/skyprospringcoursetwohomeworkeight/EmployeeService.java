package pro.sky.skyprospringcoursetwohomeworkeight;

import java.util.Map;
import java.util.Set;

public interface EmployeeService {
    String addEmployee(String name, String surname);


    Employee findEmployee(String name, String surname);

    void deleteEmployee(String name, String surname);

    Map<String, Employee> printData();

    String addPrintEmployeeKey();

   int calculateAmountMonthlySalaryCosts();

    Employee searchEmployeeSalaryMinimum();

    Employee searchEmployeeSalaryMaximum();

    int numberEmployees();

    int сalculateAverageSalary();

    void getFullNamesAllEmployees();

}

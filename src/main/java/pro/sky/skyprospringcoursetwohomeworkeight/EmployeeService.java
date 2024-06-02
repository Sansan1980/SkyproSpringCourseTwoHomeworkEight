package pro.sky.skyprospringcoursetwohomeworkeight;

import java.util.Map;

public interface EmployeeService {
    String addEmployee(String name, String surname);


    Employee findEmployee(String name, String surname);

    void deleteEmployee(String name, String surname);

    Map<String, Employee> printData();

  String addPrintEmployeeKey();
/*
    static int calculateAmountMonthlySalaryCosts();

    static Employee searchEmployeeSalaryMinimum();

    static Employee searchEmployeeSalaryMaximum();

    static int numberEmployees();

    static int сalculateAverageSalary();

    static void getFullNamesAllEmployees();*/

}

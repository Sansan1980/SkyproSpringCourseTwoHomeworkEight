package pro.sky.skyprospringcoursetwohomeworkeight.service;

import pro.sky.skyprospringcoursetwohomeworkeight.Employee;

import java.util.Map;
import java.util.Set;

public interface EmployeeService {
    String addEmployee(String name, String surname,int salary,int departmentNumber );


    Employee findEmployee(String name, String surname);

    void deleteEmployee(String name, String surname);

    Map<String, Employee> printData();

    String addPrintEmployeeKey();
}

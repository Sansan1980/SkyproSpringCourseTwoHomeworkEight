package pro.sky.skyprospringcoursetwohomeworkeight.service;

import pro.sky.skyprospringcoursetwohomeworkeight.Employee;

import java.util.Map;

public interface EmployeeService {
    String addEmployee(String name, String surname,int salary,int departmentNumber );


    Employee findEmployee(String name, String surname);

    String deleteEmployee(String name, String surname);

    Map<String, Employee> representsDataAllEmployees();

    String representsDataAllEmployeesEmployeeKey();
}

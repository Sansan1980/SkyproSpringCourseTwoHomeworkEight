package pro.sky.skyprospringcoursetwohomeworkeight.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcoursetwohomeworkeight.Employee;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class DepartmentServiceImpl implements DepartmentServise{
    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee employeeWithSalaryMax(int departmentId) {
        return employeeService.representsDataAllEmployees().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .max((employee1, employee2) -> employee1.getSalary() - employee2.getSalary())
                .orElseThrow();
    }

    public Employee employeeWithSalaryMin(int departmentId) {
        return employeeService.representsDataAllEmployees().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElseThrow();

    }

    public List<Employee> employeeFromDepartment(int departmentId) {
        return employeeService.representsDataAllEmployees().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .collect(Collectors.toList());

    }


    //   Возвращать всех сотрудников  с разделением по отделам.
    public Map<Integer, List<Employee>> allEmployeesByDepartmentId() {
        return employeeService.representsDataAllEmployees().values().stream()
                .collect(Collectors.groupingBy(Employee::getDepartmentNumber));

    }


    //-//-/
}

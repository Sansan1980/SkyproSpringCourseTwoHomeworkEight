package pro.sky.skyprospringcoursetwohomeworkeight.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcoursetwohomeworkeight.Employee;
import pro.sky.skyprospringcoursetwohomeworkeight.service.EmployeeService;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class DepartmenService {
    private final EmployeeService employeeService;

    public DepartmenService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee employeeWithSalaryMax(int departmentId) {
        return employeeService.printData().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .max((employee1, employee2) -> employee1.getSalary() - employee2.getSalary())
                .orElse(null);
    }

    public Employee employeeWithSalaryMin(int departmentId) {
        return employeeService.printData().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);//orElseThrow();//сделать лямбду исключение

    }

    public List<Employee> employeeFromDepartment(int departmentId) {
        return employeeService.printData().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .collect(Collectors.toList());

    }

    //   Возвращать всех сотрудников  с разделением по отделам.
    public Map<Integer, List<Employee>> allEmployeesByDepartmentId() {
        return employeeService.printData().values().stream()
                //.collect(Collectors.toList());
                .collect(Collectors.groupingBy(Employee::getDepartmentNumber));

    }


    //-//-/
}

package pro.sky.skyprospringcoursetwohomeworkeight.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcoursetwohomeworkeight.Employee;

import java.util.*;
import java.util.stream.Collectors;


@Service
public class DepartmenServiceImpl implements DepartmenServiceSSSS {
    private final EmployeeService employeeService ;

    public DepartmenServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee employeeWithSalaryMax(int departmentId) {
        return employeeService.printData().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .max((employee1, employee2) -> employee1.getSalary() - employee2.getSalary())
                .orElse(null);
    }

    @Override
    public Employee employeeWithSalaryMin(int departmentId) {
        return employeeService.printData().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .min(Comparator.comparingInt(Employee::getSalary))
                .orElse(null);//orElseThrow();//сделать лямбду исключение

    }

    @Override
    public List<Employee> employeeFromDepartment(int departmentId) {
        return employeeService.printData().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .collect(Collectors.toList());

    }

    //   Возвращать всех сотрудников  с разделением по отделам.
    @Override
    public Map<Integer, List<Employee>> allEmployeesByDepartmentId() {
        return employeeService.printData().values().stream()
                //.collect(Collectors.toList());
                .collect(Collectors.groupingBy(Employee::getDepartmentNumber));

    }


    //-//-/
}

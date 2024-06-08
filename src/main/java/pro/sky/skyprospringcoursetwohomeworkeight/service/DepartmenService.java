package pro.sky.skyprospringcoursetwohomeworkeight.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcoursetwohomeworkeight.Employee;
import pro.sky.skyprospringcoursetwohomeworkeight.service.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmenService {
    private final EmployeeService employeeService;

    public DepartmenService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee employeeWithSalaryMax(int departmen) {
        return employeeService.printData().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmen)
                .max((employee1,employee2)->employee1.getSalary()-employee2.getSalary())
                .orElse(null);
    }
    public List<Employee> employeeFromDepartment( int departmentId){
        return employeeService.printData().values().stream()
                .filter(employee -> employee.getDepartmentNumber() == departmentId)
                .collect(Collectors.toList());

    }
}

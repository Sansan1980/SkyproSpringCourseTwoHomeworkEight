package pro.sky.skyprospringcoursetwohomeworkeight.service;

import pro.sky.skyprospringcoursetwohomeworkeight.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmentServise {

    public Employee employeeWithSalaryMax(int departmentId);

    public Employee employeeWithSalaryMin(int departmentId);

    public List<Employee> employeeFromDepartment(int departmentId);

    //   Возвращать всех сотрудников  с разделением по отделам.
    public Map<Integer, List<Employee>> allEmployeesByDepartmentId();
}
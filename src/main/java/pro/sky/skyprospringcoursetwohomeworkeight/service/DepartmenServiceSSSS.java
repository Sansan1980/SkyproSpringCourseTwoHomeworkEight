package pro.sky.skyprospringcoursetwohomeworkeight.service;

import pro.sky.skyprospringcoursetwohomeworkeight.Employee;

import java.util.List;
import java.util.Map;

public interface DepartmenServiceSSSS {
    Employee employeeWithSalaryMax(int departmentId);

    Employee employeeWithSalaryMin(int departmentId);

    List<Employee> employeeFromDepartment(int departmentId);

    //   Возвращать всех сотрудников  с разделением по отделам.
    Map<Integer, List<Employee>> allEmployeesByDepartmentId();
}

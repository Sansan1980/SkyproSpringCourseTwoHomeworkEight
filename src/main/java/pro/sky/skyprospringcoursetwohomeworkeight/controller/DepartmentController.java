package pro.sky.skyprospringcoursetwohomeworkeight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringcoursetwohomeworkeight.Employee;
import pro.sky.skyprospringcoursetwohomeworkeight.service.DepartmenService;
import pro.sky.skyprospringcoursetwohomeworkeight.service.EmployeeService;

import java.util.List;
import java.util.Map;

@RequestMapping(path = ("/departments"))
@RestController
public class DepartmentController {

  private final DepartmenService departmenService;

    public DepartmentController(DepartmenService departmenService) {
        this.departmenService = departmenService;
    }
    ////
    //  Возвращать сотрудника с максимальной зарплатой на основе номера отдела.
    @GetMapping("/max-salary")
    public Employee employeeWithSalaryMax(@RequestParam("departmentId") int departmentId) {
        return departmenService.employeeWithSalaryMax(departmentId);
    }

    //  Возвращать сотрудника с минимальной зарплатой на основе номера отдела.
    @GetMapping("/min-salary")
    public Employee employeeWithSalaryMin(@RequestParam("departmentId") int departmentId) {
        return departmenService.employeeWithSalaryMin(departmentId);
    }

    //    Возвращать всех сотрудников по отделу.
    @GetMapping(value = "/all", params = "departmentId")
    public List<Employee> employeeFromDepartmentId(@RequestParam("departmentId") int departmentId) {
        return departmenService.employeeFromDepartment(departmentId);
    }

    //   Возвращать всех сотрудников  с разделением по отделам.
    @GetMapping(value = "/all")
    public Map<Integer, List<Employee>> allEmployeesById() {
        return departmenService.allEmployeesByDepartmentId();
    }


}

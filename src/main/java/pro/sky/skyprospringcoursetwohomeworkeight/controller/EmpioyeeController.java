package pro.sky.skyprospringcoursetwohomeworkeight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringcoursetwohomeworkeight.Employee;
import pro.sky.skyprospringcoursetwohomeworkeight.service.EmployeeService;

import java.util.Map;

@RequestMapping(path =("/employee"))
@RestController
public class EmpioyeeController {
   private final EmployeeService employeeService;

    public EmpioyeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = ("/addEmployee"))
    public String addEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname,@RequestParam("salary") int salary,@RequestParam("departmentNumber")int departmentNumber) {
        return employeeService.addEmployee(name, surname,salary,departmentNumber);

    }

    @GetMapping(path = ("/findEmployee"))
    public Employee findEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        return employeeService.findEmployee(name, surname);
    }


    @GetMapping(path = "/deleteEmployee")
    public void deleteEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        employeeService.deleteEmployee(name, surname);
    }

    @GetMapping(path = ("/representsDataAllEmployees"))
    public Map<String, Employee> representsDataAllEmployees() {
        return employeeService.representsDataAllEmployees();
    }

    @GetMapping(path = ("/representsDataAllEmployeesEmployeeKey"))
    public String representsDataAllEmployeesEmployeeKey() {
     return    employeeService.representsDataAllEmployeesEmployeeKey();
    }
    }


package pro.sky.skyprospringcoursetwohomeworkeight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RequestMapping(path =("/employee"))
@RestController
public class EmpioyeeController {
    private final EmployeeService employeeService;

    public EmpioyeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = ("/addEmployee"))
    public String addEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        return employeeService.addEmployee(name, surname);

    }

    @GetMapping(path = ("/findEmployee"))
    public Employee findEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        return employeeService.findEmployee(name, surname);
    }


    @GetMapping(path = "/deleteEmployee")
    public void deleteEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "surname") String surname) {
        employeeService.deleteEmployee(name, surname);
    }

    @GetMapping(path = ("/printData"))
    public Map<String, Employee> printData() {
        return employeeService.printData();
    }

    @GetMapping(path = ("/addPrintEmployeeKey"))
    public String addPrintEmployee() {
     return    employeeService.addPrintEmployeeKey();
    }
    }/*

    public static int calculateAmountMonthlySalaryCosts() {
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                summ = employees[i].getSalary() + summ;
            }
        }
        return summ;
    }


    public static Employee searchEmployeeSalaryMinimum() {
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employee.getSalary() > employees[i].getSalary()) {
                    employee = employees[i];
                }
            }
        }
        return employee;
    }

    public static Employee searchEmployeeSalaryMaximum() {
        Employee employee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employee.getSalary() < employees[i].getSalary()) {
                    employee = employees[i];
                }
            }
        }
        return employee;
    }

    public static int numberEmployees() {
        int size = 0;
        Employee empl = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (empl.getId() < employees[i].getId()) {
                    size = employees[i].getId();
                }
            }
        }
        return size;
    }

    public static int сalculateAverageSalary() {
        int averageSalary = calculateAmountMonthlySalaryCosts() / numberEmployees();
        return averageSalary;
    }

    public static void getFullNamesAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("ФИО сотрудника :" + employees[i].getFulName());
            }
        }
    }
}*/
//}

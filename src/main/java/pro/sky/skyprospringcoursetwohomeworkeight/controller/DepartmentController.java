package pro.sky.skyprospringcoursetwohomeworkeight.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringcoursetwohomeworkeight.Employee;

import java.util.List;
import java.util.Map;

@RequestMapping(path =("/departments"))
@RestController
public class DepartmentController {
  ////
         @GetMapping("/max-salary")
    public Employee employeeWithSalaryMax(@RequestParam("departmentId") int departmentId){

         }
            ​
  //  Возвращать сотрудника с минимальной зарплатой на основе номера отдела.

            ​
//    Возвращать всех сотрудников по отделу.
@GetMapping(value = "/all",params = "departmentId")
public List<Employee> employeeFromDepartment(@RequestParam("departmentId") int departmentId){

}

            ​
 //   Возвращать всех сотрудников с разделением по отделам.
 @GetMapping(value = "/all")
 public Map<Integer,List<Employee>> employees(){

 }


}

package pro.sky.skyprospringcoursetwohomeworkeight.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcoursetwohomeworkeight.Employee;
import pro.sky.skyprospringcoursetwohomeworkeight.exception.EmployeeAlreadyAddedException;
import pro.sky.skyprospringcoursetwohomeworkeight.exception.EmployeeNotFoundException;
import pro.sky.skyprospringcoursetwohomeworkeight.exception.EmployeeStorageIsFullException;

import java.util.*;

import static java.lang.System.*;
import static pro.sky.skyprospringcoursetwohomeworkeight.validate.Validates.validatesNumber;
import static pro.sky.skyprospringcoursetwohomeworkeight.validate.Validates.validatesString;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static Map<String, Employee> employeesMap = new HashMap<>();

    public String addEmployee(String name, String surname, int salary, int departmentNumber) {
        //включить сюда логику на проверку строк только текст surname b name,только цифры department и salary
        name = validatesString(name);
        surname = validatesString(surname);
        salary = validatesNumber(salary);
        departmentNumber = validatesNumber(departmentNumber);
        if (employeesMap.size() >= 11) {
            throw new EmployeeStorageIsFullException();
        }

        if (employeesMap.containsKey(key(name, surname))) {
            System.out.println("Такой сотрудник существуеет");
            throw new EmployeeAlreadyAddedException();
        }

        employeesMap.put(key(name, surname), new Employee(name, surname, salary, departmentNumber));
        return "Введенны новые данные " + name + " " + surname;
    }

    public Employee findEmployee(String name, String surname) {
        if (!employeesMap.containsKey(key(name, surname))) {
            throw new EmployeeNotFoundException();
        }
        return employeesMap.get(key(name, surname));//возврвщаем Employee причем тут key? что за метод get?
    }

//   }

    public String deleteEmployee(String name, String surname) {
        if (!employeesMap.containsKey(key(name, surname))) {
            throw new EmployeeNotFoundException();
        }
        employeesMap.remove(key(name, surname));
        return "Удалены  данные " + name + " " + surname;

    }

    public Map<String, Employee> printData() {
        return employeesMap;
    }

    private String key(String name, String surname) {
        return name + surname;
    }


    public String addPrintEmployeeKey() {
        Set<String> keys = employeesMap.keySet();
        Collection<Employee> values = employeesMap.values();
        return "Значения :" + values + lineSeparator() +
                "Ключи : " + keys;  // непонимаю как вернуть на страницу браузера две строки на разных строках "значенbя-Employee" b "ключи-keys" ;

    }
//--//--

}


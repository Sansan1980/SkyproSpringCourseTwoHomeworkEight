package pro.sky.skyprospringcoursetwohomeworkeight.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringcoursetwohomeworkeight.Employee;
import pro.sky.skyprospringcoursetwohomeworkeight.exception.EmployeeAlreadyAddedException;
import pro.sky.skyprospringcoursetwohomeworkeight.exception.EmployeeNotFoundException;
import pro.sky.skyprospringcoursetwohomeworkeight.exception.EmployeeStorageIsFullException;
import pro.sky.skyprospringcoursetwohomeworkeight.validate.Validates;

import java.util.*;

import static java.lang.System.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // private static List<Employee> employeesList = new ArrayList<>();
    private static Map<String, Employee> employeesMap = new HashMap<>();

    public String addEmployee(String name, String surname, int salary, int departmentNumber) {
        //включить сюда логику на проверку строк только текст surname b name,только цифры department и salary
        if (Validates.validatesString(name) && Validates.validatesString(surname) && Validates.validatesNumber(salary) && Validates.validatesNumber(departmentNumber)) {
        }
            if (employeesMap.size() >= 11) {
                throw new EmployeeStorageIsFullException();
            }

            if (employeesMap.containsKey(key(name, surname))) {
                System.out.println("Такой сотрудник существуеет");
                throw new EmployeeAlreadyAddedException();
            }

            employeesMap.put(key(name, surname), new Employee(name, surname, salary, departmentNumber));
            return "Введенны новые данные " + name + " " + surname;

     //здесь проблема
    }
        // public void findEmployee(String name, String surname) {
        //Employee employee = new Employee(name, surname);

        public Employee findEmployee (String name, String surname){
            //  for (Employee employee : employeesMap) {
            //      if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
            //        return employee;
            if (!employeesMap.containsKey(key(name, surname))) {
                throw new EmployeeNotFoundException();
            }
            return employeesMap.get(key(name, surname));//возврвщаем Employee причем тут key? что за метод get?
        }

//   }

        public String deleteEmployee (String name, String surname){
            //  Employee employee = new Employee(name, surname);
            if (!employeesMap.containsKey(key(name, surname))) {
                throw new EmployeeNotFoundException();
            }
            employeesMap.remove(key(name, surname));
            return "Удалены  данные " + name + " " + surname;

        }

        public Map<String, Employee> printData () {
            return employeesMap;
        }

        private String key (String name, String surname){
            return name + surname;
        }


        public String addPrintEmployeeKey () {
      /*  for (int i = 0; i < employeesMap.size(); i++) {
            if (employeesMap.containsKey(key(name, surname)) != null) {
                System.out.println("Данные сотрудника :" + employeesMap( new Employee(name,surname)));
            }
       }*/

            Set<String> keys = employeesMap.keySet();
            // String newLine = System.getProperty("line.separator");
            Collection<Employee> values = employeesMap.values();
            // String s1 = String.format("%s%n%s","\n", keys);
            return "Значения :" + values + lineSeparator() +
                    "Ключи : " + keys;  // непонимаю как вернуть на страницу браузера две строки на разных строках "значенbя-Employee" b "ключи-keys" //return "fdfsdfsdfsd<br>ddsfsdfsd";

        }
//--//--

}


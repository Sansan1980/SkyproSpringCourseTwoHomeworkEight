package pro.sky.skyprospringcoursetwohomeworkeight;

import org.springframework.stereotype.Service;

import java.util.*;

import static java.lang.System.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // private static List<Employee> employeesList = new ArrayList<>();
    private static Map<String, Employee> employeesMap = new HashMap();


    public String addEmployee(String name, String surname) {
        if (employeesMap.size() >= 11) {
            throw new EmployeeStorageIsFullException();
        }
        if (employeesMap.containsKey(key(name, surname))) {
            throw new EmployeeAlreadyAddedException();
        }
        employeesMap.put(key(name, surname), new Employee(name, surname));
        return "Введенны новые данные " + name + " " + surname;
    }


    // public void findEmployee(String name, String surname) {
    //Employee employee = new Employee(name, surname);

    public Employee findEmployee(String name, String surname) {
        //  for (Employee employee : employeesMap) {
        //      if (employee.getName().equals(name) && employee.getSurname().equals(surname)) {
        //        return employee;
        if (!employeesMap.containsKey(key(name, surname))) {
            throw new EmployeeNotFoundException();
        }
        return new Employee(name, surname);
    }

//   }

    public void deleteEmployee(String name, String surname) {

        //  Employee employee = new Employee(name, surname);
        if (!employeesMap.containsKey(key(name, surname))) {
            throw new EmployeeNotFoundException();
        }
        employeesMap.remove(new Employee(name, surname));

    }

    public Map<String, Employee> printData() {
        return employeesMap;
    }

    public String key(String name, String surname) {
        return name + surname;
    }


    public String addPrintEmployeeKey() {
      /*  for (int i = 0; i < employeesMap.size(); i++) {
            if (employeesMap.containsKey(key(name, surname)) != null) {
                System.out.println("Данные сотрудника :" + employeesMap( new Employee(name,surname)));
            }
       }*/

        Set<String> keys = employeesMap.keySet();
       // String newLine = System.getProperty("line.separator");
        Collection<Employee> values = employeesMap.values();
       // String s1 = String.format("%s%n%s","\n", keys);
        String s = "Значения :" + values + lineSeparator() +
                "Ключи : " + keys;
        return s; // непонимаю как вернуть на страницу браузера две строки "значенbя-Employee" b "ключи-keys"


    }


    public int calculateAmountMonthlySalaryCosts() {
       /* int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                summ = employees[i].getSalary() + summ;
            }
        }
        return summ;*/

    }


    public Employee searchEmployeeSalaryMinimum() {
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

    public Employee searchEmployeeSalaryMaximum() {
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

    public int numberEmployees() {
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

    public int сalculateAverageSalary() {
        int averageSalary = calculateAmountMonthlySalaryCosts() / numberEmployees();
        return averageSalary;
    }

    public void getFullNamesAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("ФИО сотрудника :" + employees[i].getFulName());
            }
        }
    }



//--//--

}


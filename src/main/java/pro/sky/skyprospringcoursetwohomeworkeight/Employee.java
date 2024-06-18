package pro.sky.skyprospringcoursetwohomeworkeight;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private int salary;
    private int departmentNumber;


    public Employee(String name, String surname, int salary, int departmentNumber) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.departmentNumber = departmentNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @JsonIgnore
    public String getFulName() {

        return name + ", " + surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", departmentNumber=" + departmentNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && departmentNumber == employee.departmentNumber &&
                Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary, departmentNumber);
    }
}
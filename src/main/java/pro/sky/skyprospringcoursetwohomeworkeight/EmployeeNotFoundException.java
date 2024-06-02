package pro.sky.skyprospringcoursetwohomeworkeight;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException() {
        super("Сотрудник не найден");
    }
}

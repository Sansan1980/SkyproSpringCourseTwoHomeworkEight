package pro.sky.skyprospringcoursetwohomeworkeight.exception;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException() {
        super("Сотрудник не найден");
    }
}

package pro.sky.skyprospringcoursetwohomeworkeight.exception;

public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException() {
        super ("Такой сотрудник уже существует");
    }
}

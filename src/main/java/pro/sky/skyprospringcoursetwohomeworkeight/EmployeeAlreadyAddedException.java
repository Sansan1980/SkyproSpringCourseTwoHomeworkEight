package pro.sky.skyprospringcoursetwohomeworkeight;

public class EmployeeAlreadyAddedException extends RuntimeException{
    public EmployeeAlreadyAddedException() {
        super ("Такой сотрудник уже существует");
    }
}

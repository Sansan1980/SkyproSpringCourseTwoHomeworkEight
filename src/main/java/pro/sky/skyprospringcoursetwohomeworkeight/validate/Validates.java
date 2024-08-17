package pro.sky.skyprospringcoursetwohomeworkeight.validate;


import org.apache.commons.lang3.StringUtils;
import pro.sky.skyprospringcoursetwohomeworkeight.exception.BadRequestException;


public class Validates {
    public static String  validatesString(String name) {
        if (!StringUtils.isBlank(name)) {//Проверяет, является ли CharSequence пустым (""), нулевым или содержит только пробелы.
            if (!StringUtils.isAlpha(name)) {//Проверяет, содержит ли CharSequence только буквы Unicode
                throw new BadRequestException();
               // System.out.println("текст содержит не только буквы -(isAlpha)");
            }

        } else {
             throw new BadRequestException();
            //System.out.println("  или (null) , или (пробел), или (нет символов) ");
        }
        return StringUtils.capitalize(name);//Делает строку заглавной, изменяя первый символ на заглавный согласно;
    }

    public static int  validatesNumber(int number) {
        String b = String.valueOf(number);
        if (!StringUtils.isBlank(b)) {//Проверяет, является ли CharSequence пустым (""), нулевым или содержит только пробелы.

            if (StringUtils.isNumeric(b)) {//Проверяет, содержит ли CharSequence только цифры Unicode
                System.out.println(number);
            } else {
                throw new BadRequestException();// System.out.println("текст содержит не только цифры -(isNumeric)");
            }

        } else {
            throw new BadRequestException();
            //System.out.println("  или (null) , или (пробел), или (нет символов) ");//System.out.println("  или (null) , или (пробел), или (нет символов) ");
        }
        return number;//Integer.valueOf(b);
    }
    //_____
}



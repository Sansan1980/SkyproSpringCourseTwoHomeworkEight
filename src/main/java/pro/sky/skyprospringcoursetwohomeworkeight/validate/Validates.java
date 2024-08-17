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




//      isEmpty/isBlank — проверяет, содержит ли строка текст
//      Trim/Strip — удаляет начальные и конечные пробелы.
//      ContainsOnly/ContainsNone/ContainsAny — проверяет, содержит ли строка только/ни одного/любой из этих символов
//      UpperCase/LowerCase/SwapCase/Capitalize/Uncapitalize - изменяет регистр строки
//       // StringUtils.isAlpha();//только текст
// StringUtils.isNumeric();// только цифры
//       // StringUtils.isWhitespace();// только пробеллы
//       // StringUtils.isAsciiPrintable();// только печатные символы
//      DefaultString — защищает от нулевой входной строки
//      Difference -  сравнивает строки и сообщает об их различиях.
//      [a-zA-Z]
//[0-10]


//System.out.println(!StringUtils.isEmpty/*isBlank*/(name));// если пусто или нулл ,то tru/если пусто или нулл и пробелл , то tru
//  if (StringUtils.deleteWhitespace(name)) {// удалить пробеллы

       /* if (!StringUtils.isBlank(name)) {//Проверяет, является ли CharSequence пустым (""), нулевым или содержит только пробелы.
            if (StringUtils.isAlpha(name)) {//Проверяет, содержит ли CharSequence только буквы Unicode
                System.out.println(StringUtils.capitalize(name));//Делает строку заглавной, изменяя первый символ на заглавный согласно
            } else {
                System.out.println("текст содержит не только буквы -(isAlpha)");
            }
        } else {
            System.out.println("  или (null) , или (пробел), или (нет символов) ");
        }
        // }*/
/*
        if (StringUtils.isAlpha(name)) {
            System.out.println(StringUtils.capitalize(name));//Делает строку заглавной, изменяя первый символ на заглавный согласно
        } else {
            System.out.println("текст содержит не только буквы");

        }

        if (StringUtils.isNumeric(number)) {
            System.out.println(number);
        } else {
            System.out.println(" в строке символов не цифра");
        }*/
//-------------------



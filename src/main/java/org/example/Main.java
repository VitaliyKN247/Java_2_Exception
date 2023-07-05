package org.example;

import java.util.Date;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
// необходимо повторно запросить у пользователя ввод данных.
public class Main {
    public static void main(String[] args) {
        isNumeric();
    }

    public static void isNumeric(){ // ввод данных от пользователя
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String number = in.next();
        try{
            Float.parseFloat(number);
        } catch (NumberFormatException e){
            System.out.println("Строка не является числом!");
        }
    }

}
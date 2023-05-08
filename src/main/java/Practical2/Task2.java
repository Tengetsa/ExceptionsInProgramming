package Practical2;

import java.io.FileNotFoundException;

public class Task2 {
    /*
        2. Если необходимо, исправьте данный код (задание 2
        https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

        Дан следующий код, исправьте его там, где требуется (задание 3
        https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

        Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */

    public static void main(String[] args) {
        Task2_2 b = new Task2_2();

    }

    private static void Task2_1() {
        //        try {
//            int d = 0; На ноль делить нельзя
//            double catchedRes1 = intArray[8] / d;
//            System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//            System.out.println("Catching exception: " + e);
//        }
        int d = 0;
        int i = 8;
        int[] intArray = {4, 5, 3, 1, 6, 45, 34, 22, 45};
        if (d == 0) {
            throw new RuntimeException("Деление на ноль не допускается");
        }
        try {
            double catchedRes1 = intArray[i] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}






package Practical2;

import java.util.Scanner;

public class Task1 {
    /*
        Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
        значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
        запросить у пользователя ввод данных.
     */

    public static void main(String[] args) {


        Method m = new Method();
        m.method();
    }

    public static class Method {
        public void method() {

            boolean user = true;
            while (user){
                System.out.println("введите число:");
                Scanner scan = new Scanner(System.in);
                String num = scan.nextLine();

                try {
                    float number = Float.parseFloat(num);
                    user = false;
                    System.out.println(number);
                } catch (Exception NumberFormat) {
                    System.out.println("Вы ввели строку, попробуйте ещё раз!!!");
                }
            }
        }
    }
}

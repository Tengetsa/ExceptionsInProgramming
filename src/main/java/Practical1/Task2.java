package Practical1;

import java.util.Arrays;

public class Task2 {
    /*
        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
        элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
        необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое
        пользователь может увидеть - RuntimeException, т.е. ваше.
     */
    public static void main(String[] args) {

        //int[] arr1 = {4, 2, 7, 3, 1};
        //int[] arr2 = {5, 7, 2, 3, 0};

        //int[] arr1 = {4, 2, 7, 3, 1};
        //int[] arr2 = {5, 7, 2, 3, 0};

        int[] arr1 = {4, 2, 7, 3, 1};
        int[] arr2 = {5, 7, 2, 3, 0};


        createArray(arr1, arr2);
    }
    
    public static void createArray(int[] arr1, int[] arr2) {
        float[] arr3 = new float[arr1.length];
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("Деление на ноль не допускается");
                }
                arr3[i] = (float) arr1[i] / (float) arr2[i];
            }
            System.out.println(Arrays.toString(arr3));

        } else {
            throw new RuntimeException("Длины массивов не равны");
        }

    }
}

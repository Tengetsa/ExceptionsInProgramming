package Practical1;

import java.util.Arrays;

public class Task1 {
    /*
        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
        каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
        не равны, необходимо как-то оповестить пользователя.
     */
    public static void main(String[] args) {
        //int[] arr1 = {4, 2, 7, 3, 1};
        //int[] arr2 = {5, 7, 2, 3, 0};

        int[] arr1 = {4, 2, 7, 3, 1};
        int[] arr2 = {5, 7, 2, 3,};

        DifferenceOfArrayElements(arr1, arr2);
    }


    public static void DifferenceOfArrayElements(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                arr3[i] = arr1[i] - arr2[i];
            }
            System.out.println(Arrays.toString(arr3));

        } else {
            throw new RuntimeException("Длины массивов не ровны");
        }
    }
}

package ru.fishbalka.ex3_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите длину массива: ");
        int arraySize = sc.nextInt();
        String[] array = createArray(arraySize);
        System.out.println("Элемент массива с максимальной длиной " + getArrayMaxLenVal(array));
    }

    /**
     * @param size размер массива
     * @return String[] созданный и заполненный массив
     */
    public static String[] createArray(int size) {
        Scanner scanner = new Scanner(System.in);
        String[] newArray = new String[size];
        for (int i = 0; i < newArray.length; i++) {
            System.out.print("\nВведите элемент массива: ");
            newArray[i] = scanner.nextLine();

        }
        scanner.close();
        return newArray;
    }

    public static String getArrayMaxLenVal(String[] arr) {
        String maxEl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > maxEl.length()) {
                maxEl = arr[i];
            }
        }
        return maxEl;
    }

}

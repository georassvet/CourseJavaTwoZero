package ru.fishbalka.ex4_1;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public final static int arraySize = 20;

    public static void main(String[] args) {
        int[] arr = getRandomArray(20, -20, 20); // заполняем массив
        printArr(arr);
        arr = replaceMinMax(arr); //  меняем min max
        printArr(arr);
    }

    public static int[] replaceMinMax(int[] arr) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
                continue;
            }
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
                continue;
            }
        }
        if (minIndex != maxIndex) {
            int x = arr[minIndex];
            arr[minIndex] = arr[maxIndex];
            arr[maxIndex] = x;
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] getRandomArray(int size, int minVal, int maxVal) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = getRandom(minVal, maxVal);
        }
        return newArray;
    }


    public static int getRandom(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

}

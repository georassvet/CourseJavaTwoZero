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


    // TEST:
    //-19 16 -18 -13 11 -8 -18 -18 19 18 7 0 5 -5 19 12 -3 -20 -18 -19
    //-19 16 -18 -13 11 -8 -18 -18 19 18 7 -3 5 -5 19 12 0 -20 -18 -19

    public static int[] replaceMinMax(int[] arr) {
        int minPosIndex = -1;
        int maxNegIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                if (minPosIndex == -1) {
                    minPosIndex = i;
                } else {
                    if (arr[i] < arr[minPosIndex]) {
                        minPosIndex = i;
                    }
                }
            } else {
                if (maxNegIndex == -1) {
                    maxNegIndex = i;
                } else {
                    if (arr[i] > arr[maxNegIndex]) {
                        maxNegIndex = i;
                    }
                }
            }
        }
        int temp = arr[minPosIndex];
        arr[minPosIndex] = arr[maxNegIndex];
        arr[maxNegIndex] = temp;

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

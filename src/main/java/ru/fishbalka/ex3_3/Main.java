package ru.fishbalka.ex3_3;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean alive = true;

        do {
            System.out.println("Какую программу запускаем?");
            System.out.println("1. Калькулятор");
            System.out.println("2. Поиск максимального элемента в массиве");
            System.out.println("Выход другой символ");
            int n = Integer.parseInt(sc.nextLine());

            switch (n) {
                case 1: {
                    runCalc();
                    break;
                }
                case 2: {
                    runMaxLenVal();
                    break;
                }
                default: {
                    alive = false;
                    break;
                }
            }
        } while (alive);

    }

    public static void runCalc() {
        System.out.println("Введите первое число: ");
        double num1 = Double.parseDouble(sc.nextLine()); // первое число
        System.out.println("Введите операцию: ");
        String oper = sc.nextLine(); // операция
        System.out.println("Введите второе число: ");
        double num2 = Double.parseDouble(sc.nextLine()); // второе число
        double result = 0;
        if (oper.equals("+")) {
            result = num1 + num2;
        } else if (oper.equals("-")) {
            result = num1 - num2;
        } else if (oper.equals("/")) {
            result = num1 / num2;
        } else if (oper.equals("*")) {
            result = num1 * num2;
        }
        System.out.printf("\n%.4f %s %.4f = %.4f\n", num1, oper, num2, result);
    }

    public static void runMaxLenVal() {
        System.out.print("Введите длину массива: ");
        int arraySize = Integer.parseInt(sc.nextLine());

        String[] array = createArray(arraySize);
        System.out.println("Элемент массива с максимальной длиной " + getArrayMaxLenVal(array));
    }

    /**
     * @param size размер массива
     * @return String[] созданный и заполненный массив
     */
    public static String[] createArray(int size) {
        String[] newArray = new String[size];
        for (int i = 0; i < newArray.length; i++) {
            System.out.print("\nВведите элемент массива: ");
            newArray[i] = sc.nextLine();

        }
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

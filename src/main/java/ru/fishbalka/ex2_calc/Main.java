package ru.fishbalka.ex2_calc;

import java.util.Scanner;

/**
 * @author Mokhov Sergey
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите первое число: ");
            double num1 = sc.nextDouble(); // первое число
            System.out.println("Введите операцию: ");
            String oper = sc.next(); // операция
            System.out.println("Введите второе число: ");
            double num2 = sc.nextDouble(); // второе число
            double result;
            if (oper.equals("+")) {
                result = num1 + num2;
            } else if (oper.equals("-")) {
                result = num1 - num2;
            } else if (oper.equals("/")) {
                result = num1 / num2;
            } else if (oper.equals("*")) {
                result = num1 * num2;
            } else {
                System.out.println("Операция не существует");
                break;
            }
            /*
            Вывод форматированной строки
            %s - string
            %f - double
             */

            System.out.printf("%.4f %s %.4f = %.4f\n", num1, oper, num2, result);
        } while (true);
    }
}

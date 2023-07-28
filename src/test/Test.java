package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        Напишите программу, которая находит сумму всех чисел от 1 до n,
         где n - целое число, заданное пользователем.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши число ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;

        }
        System.out.println(n + sum);


    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Проект 2. Используйте for.
        //Необходимо суммировать все нечётные целые числа в диапазоне, введённом пользователем.
        // Пользователь указывает нижнюю и верхнюю границу диапазона.

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = 0;

        for (int i = a; i == b; i++) {
            if (i % 2 == 1) {
                sum += i;

            }

        }
        System.out.println("Сумма не четных чисел в диапазоне: " + a + " до " + b + " ровна " + sum);
    }
}
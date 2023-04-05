import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Проект 3.
        //Используйте foreach.
        //Дан Enum месяцев. Пользователь вводит имя текущего месяца в консоль.
        //Программа должна вывести все месяцы, кроме того, что ввёл пользователь.

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите название месяца по английски :");
        String mon = scr.nextLine().toUpperCase();

        Month month1 = Month.valueOf(mon);

        System.out.println("Ostalnie mesjaci :");

        for (Month month : Month.values()) {
            if (month != month1) {
                System.out.print(month.name() + " ");
            }
        }
    }
}
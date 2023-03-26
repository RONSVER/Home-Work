import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(met());

    }

    public static String met() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите что то: ");
        char c = scanner.next().charAt(0);
        System.out.println(c);


        return met();






    }
}
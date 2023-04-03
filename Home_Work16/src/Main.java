import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Снека: ");
        int userNumber = scanner.nextInt();
        String message = switch (userNumber) {
            case 1 ->  concat(Snak.SNICKERS);
            case 2 ->  concat(Snak.BOUNTY);
            case 3 ->  concat(Snak.TWIX);
            case 4 ->  concat(Snak.MARS);
            default -> "Введен не правильный номер!";
        };
        System.out.println(message);

    }

    private static String concat(Snak sn) {
        return sn.name();
    }
    }

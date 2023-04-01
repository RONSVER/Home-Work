import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Пользователь вводит, сколько лет он состоит в браке.
        // Программа должна вывести, какая годовщина свадьбы будет у пользователя следующей
        // (бумажная, ситцевая, чугунная, серебряная и.д.).
        // Не обязательно указывать все годовщины, достаточно 10-15
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your wedding anniversary: ");
        int userNumber = scanner.nextInt();
        Anniversaries message = switch (userNumber) {
            case 0 ->  Anniversaries.print_wedding;
            case 1 ->  Anniversaries.paper_wedding;
            case 2 ->  Anniversaries.Leather_Wedding;
            case 3 ->  Anniversaries.linen_wedding;
            case 4 ->  Anniversaries.wooden_wedding;
            case 5 ->  Anniversaries.Castiron_weddings;
            case 6 ->  Anniversaries.Copper_weddings;
            case 7 ->  Anniversaries.Tin_wedding;
            case 8 ->  Anniversaries.faience_weddings;
            case 9 ->  Anniversaries.stannic_weddings;
            case 10 ->  Anniversaries.steel_wedding;
            default -> Anniversaries.write_the_correct_number;

        };
        System.out.println(message);

    }

    }

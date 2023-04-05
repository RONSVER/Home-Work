import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //1 уровень сложности: Проект 1. Используйте while:
        //Напиши программу, которая моделирует ситуацию.
        //Ты попросил друзей скинуться на подарок на твой День Рождения.
        //Каждый друг случайным образом может подарить тебе одну купюру номиналом 500, 1000, 2000 или 5000 рублей.
        //Твоя цель - новенький игровой ПК, который стоит 100 000 рублей.


        int total = 0;
        int fin = 100000;
        Random rnd = new Random();
        while (total < fin) {
            System.out.println("Собранная сумма на данный момент: " + total);
            int a = 0;
            int b = rnd.nextInt(4);
            switch (b) {
                case 0:
                    a = 500;
                    break;
                case 1:
                    a = 1000;
                    break;
                case 2:
                    a = 2000;
                    break;
                case 3:
                    a = 5000;
                    break;

            }
            total += a;


        }
        System.out.println("Друзья собрали нужную сумму: " + total + "Рублей!");

    }
}

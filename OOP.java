import java.util.Scanner;

public class OOP { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String obj;
        int cash;
        int num;

        System.out.println("Что ты хочешь купить?");
        obj = scanner.nextLine();

        System.out.println("Сколько у тебя денег?");
        cash = scanner.nextInt();

        System.out.println("В какой магазин ты хочешь пойти: 1 или 2?");
        num = scanner.nextInt();

        if (num == 1) {
            Pokupatel1 pokupatel1 = new Pokupatel1(obj, cash);
        }
        else {
        Pokupatel2 pokupatel2 = new Pokupatel2(obj, cash);
        }
        

    }
}


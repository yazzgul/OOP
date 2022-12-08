import java.util.Scanner;

public class OOP { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String obj;
        int cash;
        int num;
        String name;

        System.out.println("Назови свое имя");
        name = scanner.nextLine();

        System.out.println("Что ты хочешь купить?");
        obj = scanner.nextLine();

        System.out.println("Сколько у тебя денег?");
        cash = scanner.nextInt();

        System.out.println("В какой магазин ты хочешь пойти: 1 или 2?");
        num = scanner.nextInt();


        if (num == 1) {
            Pokupatel1 pokupatel1 = new Pokupatel1(obj, cash);
            pokupatel1.setName(name);
            System.out.println("Ваш код для получения заказа:" + pokupatel1);
        }
        else {
        Pokupatel2 pokupatel2 = new Pokupatel2(obj, cash);
        pokupatel2.setName(name);
        System.out.println("Ваш код для получения заказа:" + pokupatel2);
        }

        System.out.println("Владеет ли собственник 1 магазина вторым?");
        Store1 store1 = new Store1();
        Store2 store2 = new Store2();
        System.out.println(store1.equals(store2));

    }
}



public class Prodavec2 extends Store2 implements Dostavka {
    double procent = 0;
    int money;
    int cost;
    int dost = 20;

    @Override
    public void dostavka() {
        System.out.println("Доставка будет выполняться на грузовике");
        // dost = 30;
    }

    Prodavec2() {
        super();
    }

    public int buy(String obj, int cash) {
        boolean have = false;
        switch (obj) {
            case "mirror" :
                have = true;
                cost = 15;
                break;
            case "fridge" :
                have = true;
                cost = 45;
                break;
            case "wardrobe" :
                cost = 25;
                break;
            case "bed" :
                have = true;
                cost = 35;
                break;
            case "lamp" :
                cost = 15;
                break;
        }
        
        money = dost + cost;
        if (have == false) {
            if (cash >= money) {
                Sklad object = new Sklad();
                if (object.vSklad(obj) == true) {
                    System.out.println("Спасибо за покупку! С вас " + money  );
                    Prodavec2 del = new Prodavec2();
                    del.dostavka();
                    procent += money * 0.1 ;
                    cash = cash - money;
                }
                else {
                    System.out.println("К сожалению, товара нет в наличии!");
                }
            }
            else {
                System.out.println("У вас недостаточно денег!");
            }
        }
        else {
            if (cash >= cost) {
                System.out.println("Спасибо за покупку! С вас " + cost);
                procent += cost * 0.1 ;
                cash = cash - cost;
            }
            else {
                System.out.println("У вас недостаточно денег!");
            }
        }
        return cash;


    }
}
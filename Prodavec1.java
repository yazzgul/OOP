
public class Prodavec1 extends Store1 {
    double procent = 0;
    int money;
    int dostavka = 20;
    int cost;

    Prodavec1() {
        super();
    }

    public int buy(String obj, int cash) {
        boolean have = false;
        switch (obj) {
            case "mirror" :
                cost = 20;
                break;
            case "fridge" :
                cost = 50;
                break;
            case "wardrobe" :
                cost = 30;
                break;
            case "bed" :
                have = true;
                cost = 40;
                break;
            case "lamp" :
                have = true;
                cost = 20;
                break;
        }
        money = dostavka + cost;
        if (cash >= money) {
            if (have == false) {
                Sklad object = new Sklad();
                if (object.vSklad(obj) == true) {
                    System.out.println("Спасибо за покупку! С вас " + money  );
                    procent += money * 0.1 ;
                    cash = cash - money;
                }
                else {
                    System.out.println("К сожалению, товара нет в наличии!");
                }
            }
            else {
                System.out.println("Спасибо за покупку! С вас " + cost);
                procent += cost * 0.1 ;
                cash = cash - cost;
            }
        }
        else {
            System.out.println("У вас недостаточно денег!");
        }
        return cash;


    }

    
}

public class Prodavec2 extends Store2 {
    double procent = 0;
    int money;
    int cost;
    int dostavka = 30;

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
        money = dostavka + cost;
        if (cash >= money) {
            if (have == false) {
                Sklad object = new Sklad();
                if (object.vSklad(obj) == true) {
                    System.out.println("Спасибо за покупку! С вас " + money  );
                    procent += money * 0.1 ;
                    cash = cash - money ;

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
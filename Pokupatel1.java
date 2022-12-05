
public class Pokupatel1 {
    int cash;
    String object;
    Pokupatel1(String object, int cash) {
        this.object = object;
        this.cash = cash;

        Prodavec1 pokupka = new Prodavec1();
        System.out.println("Остаток: " + pokupka.buy(object, cash)) ; 
    }



    
}
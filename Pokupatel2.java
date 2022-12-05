
public class Pokupatel2 {
    int cash;
    String object;
    Pokupatel2(String object, int cash) {
        this.object = object;
        this.cash = cash;

        Prodavec2 pokupka = new Prodavec2();
        System.out.println("Остаток: " + pokupka.buy(object, cash));
    }
}

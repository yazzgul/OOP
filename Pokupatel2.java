
public class Pokupatel2 {
    int cash;
    String object;
    int id = 1;
    Pokupatel2(String object, int cash) {
        this.object = object;
        this.cash = cash;

        Prodavec2 pokupka = new Prodavec2();
        System.out.println("Остаток: " + pokupka.buy(object, cash));
    }


    String name;
    public void setName(String name) {
        this.name = name; 
    }

    public String toString() {
        return name +","+id;
    }

}

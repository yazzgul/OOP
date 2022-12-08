
public class Pokupatel1 {
    int cash;
    String object;
    int id = 1 ;
    Pokupatel1(String object, int cash) {
        this.object = object;
        this.cash = cash;

        Prodavec1 pokupka = new Prodavec1();
        System.out.println("Остаток: " + pokupka.buy(object, cash)) ; 
    }


    String name;
    public void setName(String name) {
        this.name = name; 
    }
    public String toString() {
        return name +","+id;
    }

}
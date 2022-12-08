
public class Store1 extends Sklad{
    boolean mirror = false;
    boolean fridge = false;
    boolean wardrobe = false;
    boolean bed = true;
    boolean lamp = true;
    String owner = "OOO BuyPls";

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Store1 store = (Store1) obj;
        return owner == store.owner;
    }
}
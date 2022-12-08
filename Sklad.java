
public class Sklad {
    boolean mirror = true;
    boolean fridge = true;
    boolean wardrobe = false;
    boolean bed = true;
    boolean lamp = true;
    String owner = "OOO BuyPls";
    
    boolean vSklad(String obj) {
        boolean have = false;
        switch (obj) {
            case "mirror" :
                have = true;
                break;
            case "fridge" :
                have = true;
                break;
            case "wardrobe" :
                break;
            case "bed" :
                have = true;
                break;
            case "lamp" :
                have = true;
                break;
        }
        return have;
    }

}

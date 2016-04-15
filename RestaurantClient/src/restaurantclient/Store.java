package restaurantclient;

public class Store {
      
    // Fields
    public static String name;
    public static final double TAX_RATE = 17.5;


    // Constructor
    public Store(String startName) { name = startName; }


    // Methods
    public String getName() { return name; }

    public String setName(String newName) {
        name = newName;
        return name;
    }
      
      
      
}

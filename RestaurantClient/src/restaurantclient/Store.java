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
    
    @Override
    public String toString() {
        String str = "";
        str += "This store's name is " + this.name + "\n" +
                "The tax rate is " + TAX_RATE;
        return str;
    }
      
    @Override
    public boolean equals(Object o) {
        Boolean b = false;
        if (this == o) {
            b = true;
        }
        return b;
    }
      
}

package restaurantclient;
import java.math.*;
public class Restaurant extends Store {
      
    // Fields
    public int ACS;
    public double avgPrice;


    // Constructor
    public Restaurant(String startName, int newACS, double avgPrice) {
        super(startName);
        ACS = newACS;
    }


    // Methods
    public int getACS() { return ACS; }

    public int setACS(int newACS) {
        ACS = newACS;
        return ACS;
    }
    
    public double getAvgPrice() { return avgPrice; }
    
    public double setAvgPrice(double newPrice) {
        avgPrice = newPrice;
        return avgPrice;
    }

    public double avgYearlyTax() {
        double taxTotal = (avgPrice * ACS) * (Store.TAX_RATE / 100);
        return taxTotal;
    }


}

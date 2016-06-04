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
        this.ACS = newACS;
        return ACS;
    }
    
    public double getAvgPrice() { return avgPrice; }
    
    public double setAvgPrice(double newPrice) {
        this.avgPrice = newPrice;
        return avgPrice;
    }

    public double avgYearlyTax() {
        double taxTotal = (double) (avgPrice * ACS) * (Store.TAX_RATE / 100);
        return taxTotal;
    }

    @Override
    public String toString() {
        String str = "";
        str += "This restaurant has served " + this.ACS + " customers this year!\n" + 
                "The average price per customer is $" + this.avgPrice + ".";
        return str;
    }
}

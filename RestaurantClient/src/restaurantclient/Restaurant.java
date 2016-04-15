package restaurantclient;

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
      
      public double avgYearlyTax() {
            double tax = (avgPrice * ACS) * (17.5 / 100);
            return tax;
      }
      
      
}

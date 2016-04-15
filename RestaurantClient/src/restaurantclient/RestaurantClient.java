package restaurantclient;

public class RestaurantClient {

      public static void main(String[] args) {
            Store store = new Store("");
            Restaurant restau = new Restaurant("Hello", 81238, 2183.22);
            
            
            System.out.println("Taxes: " + restau.avgYearlyTax());
            
      }
      
}

package restaurantclient;

public class RestaurantClient {

    public static void main(String[] args) {
        // Instantiate objects
        Store store = new Store("Story");
        Restaurant restau = new Restaurant("Eatery", 81238, 20.0);
        
        // Test restaurant methods
        System.out.println("Name: " + restau.getName());
        restau.setName("Nommeville");
        System.out.println("New name: " + restau.getName());
        
        System.out.println("Customers served this year: " + restau.ACS);
        System.out.println("Price per customer: "+ restau.getAvgPrice());
        restau.setAvgPrice(201.10);
 
        System.out.println("Average price at Eatery: $" + restau.avgPrice);
        System.out.println("Tax rate: " + store.TAX_RATE + "%");
        System.out.printf("Taxes: %.2f\n", restau.avgYearlyTax());

        System.out.println("Is restau equal to store? " + restau.equals(store));
        
        System.out.println(restau.toString());
        
        // Test store methods
        System.out.println("Name: " + store.getName());
        System.out.println("New name: " + store.setName("Story Thyme"));
        System.out.println("Store's tax rate: " + store.TAX_RATE + "%");
        System.out.println(store.toString());
        System.out.println("Is store equal to restau? " + store.equals(restau));
    }
      
}

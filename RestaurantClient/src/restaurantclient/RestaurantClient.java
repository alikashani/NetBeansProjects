package restaurantclient;

public class RestaurantClient {

    public static void main(String[] args) {
        
        Store store = new Store("Story");
        Restaurant restau = new Restaurant("Eatery", 81238, 20.0);

        System.out.println("Name: " + restau.getName());
        System.out.println("Customers served this year: " + restau.ACS);
        
        restau.setAvgPrice(201.10);
        System.out.println("Average price at Eatery: $" + restau.avgPrice);
        System.out.println("Tax rate: " + store.TAX_RATE + "%");
        System.out.printf("Taxes: %.2f\n", restau.avgYearlyTax());

        System.out.println("Is store equal to restau? " + store.equals(restau));
        
    }
      
}

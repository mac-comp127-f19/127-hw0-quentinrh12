package activityStarterCode.maps;


import java.util.HashMap;

public class RestaurantExplorer {
    public static void main(String [] args) {

        HashMap<String, Restaurant> restaurants = new HashMap<>();
        // Step 1. Create a new empty HashMap.
        // The keys should be the names of the restaurant.
        // The values should be the restaurant objects.

        restaurants.put("Olive Garden", new Restaurant("Olive Garden", "Italian", 5));
        restaurants.put("Chili's", new Restaurant("Chili's", "American", 1));
        restaurants.put("Outback Steakhouse", new Restaurant("Outback Steakhouse", "Australian", 4));
        restaurants.put("Panda Express", new Restaurant("Panda Express", "Asian", 5));
        restaurants.put("Rah'mn", new Restaurant("Rah'mn", "Japanese", 4));
        // Step 2. Add five restaurants to the map (hint: use put()).

        // Step 3. Print the names of each restaurant (hint: use keySet()).
        System.out.println(restaurants.keySet());
        // Step 4. Remove one of the restaurants by name. Check to make sure
        // it no longer exists and print out the result (hint: use containsKey()).
        restaurants.remove("Chili's");
        System.out.println(restaurants.containsKey("Chili's"));
        // Step 5. Print the restaurant objects (hint: use values())

        System.out.println(restaurants.values());
        // Step 6. Print the restaurant names and objects (hint: use entrySet()).
        System.out.println(restaurants.entrySet());
    }
}

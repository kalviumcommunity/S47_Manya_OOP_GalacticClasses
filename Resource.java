public class Resource {
    private String type;
    private int quantity;
    
    private static int totalResourcesConsumed = 0;

    public Resource(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    // Overloaded consume method 1
    public void consume(int amount) {
        if (amount > quantity) {
            System.out.println("Not enough " + type + " to consume.");
        } else {
            quantity -= amount;
            totalResourcesConsumed += amount;
            System.out.println(amount + " units of " + type + " consumed. Remaining: " + quantity);
        }
    }

    // Overloaded consume method with a message
    public void consume(int amount, String message) {
        System.out.println(message);
        consume(amount);  // Calling the single-parameter consume method
    }

    public void reload(int amount) {
        quantity += amount;
        System.out.println(amount + " units of " + type + " added. New total: " + quantity);
    }

    public static int getTotalResourcesConsumed() {
        return totalResourcesConsumed;
    }
}

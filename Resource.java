public class Resource {
    private String type;
    private int quantity;
    // Static variable created to track total resources consumed
    private static int totalResourcesConsumed = 0;

    public Resource(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public void consume(int amount) {
        if (amount > quantity) {
            System.out.println("Not enough " + type + " to consume.");
        } else {
            quantity -= amount;
            totalResourcesConsumed += amount;  // Increment total resources consumed
            System.out.println(amount + " units of " + type + " consumed. Remaining: " + quantity);
        }
    }

    public void replenish(int amount) {
        quantity += amount;
        System.out.println(amount + " units of " + type + " added. New total: " + quantity);
    }

    // Static method created to get the total resources consumed
    public static int getTotalResourcesConsumed() {
        return totalResourcesConsumed;
    }

    public int getQuantity() {
        return quantity;
    }
}

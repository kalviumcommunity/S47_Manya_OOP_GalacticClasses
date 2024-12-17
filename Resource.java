public class Resource {
    private String resourceName;
    private int quantity;
    private static int totalResourcesConsumed = 0;

    // Constructor to initialize Resource details
    public Resource(String resourceName, int quantity) {
        this.resourceName = resourceName;
        this.quantity = quantity;
    }

    public void consume(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            totalResourcesConsumed += amount;
            System.out.println(amount + " units of " + resourceName + " consumed.");
        } else {
            System.out.println("Not enough " + resourceName + " available!");
        }
    }

    public void reload(int amount) {
        quantity += amount;
        System.out.println(amount + " units of " + resourceName + " reloaded.");
    }

    public static int getTotalResourcesConsumed() {
        return totalResourcesConsumed;
    }
}

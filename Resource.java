public class Resource {
    private String resourceName;
    private int quantity;
    private static int totalResourcesConsumed = 0;

    // Default Constructor
    public Resource() {
        this.resourceName = "Unknown Resource";
        this.quantity = 0;
    }

    // Parameterized Constructor
    public Resource(String resourceName, int quantity) {
        this.resourceName = resourceName;
        this.quantity = quantity;
    }

    public void consume(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            totalResourcesConsumed += amount;
        } else {
            System.out.println("Not enough " + resourceName + " available!");
        }
    }

    public void reload(int amount) {
        quantity += amount;
    }

    public String getResourceName() {
        return resourceName;
    }

    public static int getTotalResourcesConsumed() {
        return totalResourcesConsumed;
    }
}

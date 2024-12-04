public class Resource {
    // Private data members
    private String resourceName;
    private int resourceAmount;

    // Static member to track total resources consumed
    private static int totalResourcesConsumed = 0;

    // Constructor
    public Resource(String resourceName, int resourceAmount) {
        this.resourceName = resourceName;
        this.resourceAmount = resourceAmount;
    }

    // Accessor (getter) methods
    public String getResourceName() {
        return resourceName;
    }

    public int getResourceAmount() {
        return resourceAmount;
    }

    // Mutator (setter) methods
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public void setResourceAmount(int resourceAmount) {
        if (resourceAmount >= 0) {
            this.resourceAmount = resourceAmount;
        } else {
            System.out.println("Resource amount cannot be negative!");
        }
    }

    // Method to consume resource
    public void consume(int amount) {
        if (resourceAmount >= amount) {
            resourceAmount -= amount;
            totalResourcesConsumed += amount;
            System.out.println(amount + " units of " + resourceName + " consumed. Remaining: " + resourceAmount);
        } else {
            System.out.println("Not enough " + resourceName + " available.");
        }
    }

    // Method to reload resource
    public void reload(int amount) {
        resourceAmount += amount;
        System.out.println(amount + " units of " + resourceName + " added. Total: " + resourceAmount);
    }

    // Static method to get total resources consumed
    public static int getTotalResourcesConsumed() {
        return totalResourcesConsumed;
    }
}

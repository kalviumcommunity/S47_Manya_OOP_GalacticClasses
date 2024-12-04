public class Resource {
    // Private data members
    private String resourceName;
    private int resourceAmount;

    static int totalResourcesConsumed = 0;

    // Public constructor
    public Resource(String resourceName, int resourceAmount) {
        this.resourceName = resourceName;
        this.resourceAmount = resourceAmount;
    }

    // Public accessor (getter) methods
    public String getResourceName() {
        return resourceName;
    }

    public int getResourceAmount() {
        return resourceAmount;
    }

    // Public mutator (setter) methods
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

    // Public method to consume resource
    public void consume(int amount) {
        if (resourceAmount >= amount) {
            resourceAmount -= amount;
            totalResourcesConsumed += amount;
            System.out.println(amount + " units of " + resourceName + " consumed. Remaining: " + resourceAmount);
        } else {
            System.out.println("Not enough " + resourceName + " available.");
        }
    }

    public static void displayTotalResourcesConsumed() {
        System.out.println("Total Resources Consumed: " + totalResourcesConsumed + " units.");
    }
}

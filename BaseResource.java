public class BaseResource {
    private String resourceName;
    private int quantity;

    public BaseResource(String resourceName, int quantity) {
        this.resourceName = resourceName;
        this.quantity = quantity;
    }

    public void consume(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " units of " + resourceName + " consumed. Remaining: " + quantity);
        } else {
            System.out.println("Not enough " + resourceName + " available!");
        }
    }

    public void reload(int amount) {
        quantity += amount;
        System.out.println(amount + " units of " + resourceName + " reloaded. Total: " + quantity);
    }

    public String getResourceName() {
        return resourceName;
    }

    public int getQuantity() {
        return quantity;
    }
}

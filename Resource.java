public abstract class Resource {
    private String type;
    private int quantity;

    private static int totalResourcesConsumed = 0;

    public Resource(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public abstract void consume(int amount);

    public void reload(int amount) {
        quantity += amount;
        System.out.println(amount + " units of " + type + " added. New total: " + quantity);
    }

    protected int getQuantity() {
        return quantity;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    protected void incrementTotalConsumed(int amount) {
        totalResourcesConsumed += amount;
    }

    public static int getTotalResourcesConsumed() {
        return totalResourcesConsumed;
    }
}

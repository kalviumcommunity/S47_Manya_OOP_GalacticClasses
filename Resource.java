public class Resource {
    private String type;
    private int quantity;

    public Resource(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public void consume(int amt) {
        if (amt > quantity) {
            System.out.println("Not enough " + type + " to consume.");
        } else {
            quantity -= amt;
            System.out.println(amt + " units of " + type + " consumed. Remaining: " + quantity);
        }
    }

    public void reload(int amt) {
        quantity += amt;
        System.out.println(amt + " units of " + type + " added. New total: " + quantity);
    }

    public int getQuantity() {
        return quantity;
    }
}

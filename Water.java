public class Water extends Resource {
    public Water(int quantity) {
        super("Water", quantity);
    }

    public void refill(int amount) {
        reload(amount);
        System.out.println("Refilled " + amount + " units of Water.");
    }
}

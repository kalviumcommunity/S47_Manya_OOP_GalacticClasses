public class Water extends Resource {
    public Water(int quantity) {
        super("Water", quantity);
    }

    @Override
    public void consume(int amount) {
        if (amount > getQuantity()) {
            System.out.println("Not enough Water to consume.");
        } else {
            setQuantity(getQuantity() - amount);
            incrementTotalConsumed(amount);
            System.out.println(amount + " units of Water consumed. Remaining: " + getQuantity());
        }
    }
}

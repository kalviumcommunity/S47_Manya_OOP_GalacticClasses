public class Fuel extends Resource {
    public Fuel(int quantity) {
        super("Fuel", quantity);
    }

    @Override
    public void consume(int amount) {
        if (amount > getQuantity()) {
            System.out.println("Not enough Fuel to consume.");
        } else {
            setQuantity(getQuantity() - amount);
            incrementTotalConsumed(amount);
            System.out.println(amount + " units of Fuel consumed. Remaining: " + getQuantity());
        }
    }
}

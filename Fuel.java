public class Fuel extends Resource {
    public Fuel(int quantity) {
        super("Fuel", quantity);
    }

    public void refuel(int amount) {
        reload(amount);
        System.out.println("Refueled " + amount + " units of Fuel.");
    }
}

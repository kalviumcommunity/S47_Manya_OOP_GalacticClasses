public class Inheritance {
    public static void main(String[] args) {
        Fuel fuel = new Fuel(100);
        fuel.consume(30);
        fuel.consume(20, "Consuming with a message");

        Water water = new Water(50);
        water.consume(10);
        water.consume(15, "Drinking water");

        System.out.println("Total Resources Consumed: " + Resource.getTotalResourcesConsumed());
    }
}

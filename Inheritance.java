public class Inheritance {
    public static void main(String[] args) {
        Fuel fuel = new Fuel(100);
        fuel.consume(30);
        fuel.refuel(20);

        Water water = new Water(50);
        water.consume(10);
        water.refill(25);

        System.out.println("Total Resources Consumed: " + Resource.getTotalResourcesConsumed());
    }
}

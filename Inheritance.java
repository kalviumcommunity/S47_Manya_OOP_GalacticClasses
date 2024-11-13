public class Inheritance {
    public static void main(String[] args) {
        Resource fuel = new Fuel(100);
        fuel.consume(30);
        fuel.reload(20);

        Resource water = new Water(50);
        water.consume(10);
        water.reload(25);

        System.out.println("Total Resources Consumed: " + Resource.getTotalResourcesConsumed());
    }
}

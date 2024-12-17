public class Main {
    public static void main(String[] args) {
        // Astronaut instances
        Astronaut astronaut1 = new Astronaut("Manya", 5, 3);
        Astronaut astronaut2 = new Astronaut("Hanshul", 4, 2);

        // Resource instances
        Resource oxygen = new Resource("Oxygen", 100);
        Resource food = new Resource("Food", 50);

        // Astronauts consume resources
        astronaut1.consumeOxygen();
        astronaut1.consumeFood();

        astronaut2.consumeOxygen();
        astronaut2.consumeFood();

        // Resources being consumed and reloaded
        oxygen.consume(10);
        oxygen.reload(20);

        food.consume(15);
        food.reload(10);

        // Display total astronauts and resources consumed
        System.out.println("Total number of astronauts: " + Astronaut.getTotalAstronauts());
        System.out.println("Total resources consumed: " + Resource.getTotalResourcesConsumed() + " units.");
    }
}

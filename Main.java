public class Main {
    public static void main(String[] args) {
        Astronaut[] astronauts = new Astronaut[3];
        astronauts[0] = new Astronaut("John", 5, 3);
        astronauts[1] = new Astronaut("Alice", 4, 2);
        astronauts[2] = new Astronaut("Bob", 6, 4);

        for (Astronaut astronaut : astronauts) {
            astronaut.consumeOxygen();
            astronaut.consumeFood();
        }

        Resource oxygen = new Resource("Oxygen", 100);
        Resource food = new Resource("Food", 50);

        oxygen.consume(10);
        oxygen.replenish(20);

        food.consume(15);
        food.replenish(10);

        // Displaying total number of astronauts created
        System.out.println("Total number of astronauts: " + Astronaut.getTotalAstronauts());

        // Displaying total resources consumed
        System.out.println("Total resources consumed: " + Resource.getTotalResourcesConsumed() + " units.");
    }
}

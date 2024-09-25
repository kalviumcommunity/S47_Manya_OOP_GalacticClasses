public class Main {
    public static void main(String[] args) {
        Astronaut[] astronauts = new Astronaut[3];
        astronauts[0] = new Astronaut("Manya", 5, 3);
        astronauts[1] = new Astronaut("Hanshul", 4, 2);
        astronauts[2] = new Astronaut("Dhruv", 6, 4);

        for (Astronaut astronaut : astronauts) {
            astronaut.consumeOxygen();
            astronaut.consumeFood();
        }

        // Calling the static method to display astronaut information
        Astronaut.displayAstronautInfo(astronauts[0]);  // Display info for the first astronaut

        Resource oxygen = new Resource("Oxygen", 100);
        Resource food = new Resource("Food", 50);

        oxygen.consume(10);
        oxygen.reload(20);

        food.consume(15);
        food.reload(10);

        System.out.println("Total number of astronauts: " + Astronaut.getTotalAstronauts());

        System.out.println("Total resources consumed: " + Resource.getTotalResourcesConsumed() + " units.");
    }
}

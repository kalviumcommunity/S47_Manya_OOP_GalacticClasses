public class Main {
    public static void main(String[] args) {
        // Dynamically allocate an array of Astronaut objects
        Astronaut[] astronauts = new Astronaut[3];
        astronauts[0] = new Astronaut("Manya", 5, 3);
        astronauts[1] = new Astronaut("Hanshul", 4, 2);
        astronauts[2] = new Astronaut("Ishita", 6, 4);

        for (Astronaut astronaut : astronauts) {
            astronaut.consumeOxygen();
            astronaut.consumeFood();
        }

        // Dynamically allocate Resource objects
        Resource oxygen = new Resource("Oxygen", 100);
        Resource food = new Resource("Food", 50);

        // Simulate resource consumption and replenishment dynamically
        oxygen.consume(10);
        oxygen.reload(20);

        food.consume(15);
        food.reload(10);
    }
}
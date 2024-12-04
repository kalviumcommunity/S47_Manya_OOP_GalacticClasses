public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Astronaut defaultAstronaut = new Astronaut();
        System.out.println("Default Astronaut Name: " + defaultAstronaut.getName());

        // Using parameterized constructor
        Astronaut astronaut1 = new Astronaut("Manya", 5, 3);
        Astronaut astronaut2 = new Astronaut("Hanshul", 4, 2);

        // Using default constructor for Resource
        Resource defaultResource = new Resource();
        System.out.println("Default Resource Name: " + defaultResource.getResourceName());

        // Using parameterized constructor for Resource
        Resource oxygen = new Resource("Oxygen", 100);
        Resource food = new Resource("Food", 50);

        // Demonstrating functionality
        astronaut1.consumeOxygen();
        astronaut1.consumeFood();
        astronaut2.consumeOxygen();
        astronaut2.consumeFood();

        oxygen.consume(10);
        oxygen.reload(20);

        food.consume(15);
        food.reload(10);

        System.out.println("Total number of astronauts: " + Astronaut.getTotalAstronauts());
        System.out.println("Total resources consumed: " + Resource.getTotalResourcesConsumed() + " units.");
    }
}

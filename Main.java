public class Main {
    public static void main(String[] args) {
        // Base class Astronaut
        Astronaut astronaut1 = new Astronaut("Manya", 5, 3);

        // Extended class SpecialAstronaut
        SpecialAstronaut specialAstronaut = new SpecialAstronaut("Hanshul", 4, 2, 2);

        // Base class Resource
        Resource oxygen = new Resource("Oxygen", 100);

        // Extended class SpecialResource
        SpecialResource food = new SpecialResource("Food", 50, 10);

        // Demonstrating base class functionality
        astronaut1.consumeOxygen();
        astronaut1.consumeFood();

        // Demonstrating extended class functionality
        specialAstronaut.consumeOxygen();
        specialAstronaut.consumeFood();

        oxygen.consume(10);
        oxygen.reload(20);

        food.consume(15);
        food.provideBonusSupply();

        // Display total astronauts and resources consumed
        System.out.println("Total number of astronauts: " + Astronaut.getTotalAstronauts());
        System.out.println("Total resources consumed: " + Resource.getTotalResourcesConsumed() + " units.");
    }
}

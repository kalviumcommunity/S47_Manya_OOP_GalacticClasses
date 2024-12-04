public class Main {
    public static void main(String[] args) {
        Astronaut astronaut1 = new Astronaut("Manya", 10, 5);
        Astronaut astronaut2 = new Astronaut("Hanshul", 8, 6);

        // Display astronaut information using public methods
        astronaut1.displayInfo();
        astronaut2.displayInfo();

        // Modify astronaut data using public mutator methods
        astronaut1.setOxygenLevel(12);
        astronaut2.setFoodLevel(7);

        System.out.println("\nAfter Updates:");
        astronaut1.displayInfo();
        astronaut2.displayInfo();

        Resource oxygen = new Resource("Oxygen", 100);
        Resource food = new Resource("Food", 50);

        // Use public methods to consume and modify resources
        oxygen.consume(20);
        food.consume(15);

        // Modify resource details using mutators
        oxygen.setResourceName("Life-Support Oxygen");
        food.setResourceAmount(40);

        System.out.println("\nResource Updates:");
        System.out.println("Oxygen Resource Name: " + oxygen.getResourceName());
        System.out.println("Food Resource Amount: " + food.getResourceAmount());

        Resource.displayTotalResourcesConsumed();

        System.out.println("\nTotal Astronauts: " + Astronaut.totalAstronauts);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Astronaut[] astronauts = new Astronaut[3];
        astronauts[0] = new Astronaut("Manya", 5, 3);
        astronauts[1] = new Astronaut("Hanshul", 4, 2);
        astronauts[2] = new Astronaut("Dhruv", 6, 4);

        // Display initial details using accessor methods
        for (Astronaut astronaut : astronauts) {
            System.out.println("Astronaut Name: " + astronaut.getName());
            System.out.println("Oxygen Level: " + astronaut.getOxygenLevel());
            System.out.println("Food Level: " + astronaut.getFoodLevel());
        }

        // Modify astronaut data using mutator methods
        astronauts[0].setOxygenLevel(10);
        astronauts[1].setFoodLevel(5);

        // Create resources
        Resource oxygen = new Resource("Oxygen", 100);
        Resource food = new Resource("Food", 50);

        // Use accessor and mutator methods on resources
        System.out.println("Resource Name: " + oxygen.getResourceName());
        System.out.println("Initial Amount: " + oxygen.getResourceAmount());

        oxygen.setResourceAmount(120); // Modify resource amount
        System.out.println("Updated Amount: " + oxygen.getResourceAmount());

        // Consume and reload resources
        oxygen.consume(20);
        food.reload(15);

        // Display final astronaut data using accessor methods
        for (Astronaut astronaut : astronauts) {
            System.out.println("Astronaut Name: " + astronaut.getName());
            System.out.println("Final Oxygen Level: " + astronaut.getOxygenLevel());
            System.out.println("Final Food Level: " + astronaut.getFoodLevel());
        }

        // Display total resources consumed
        System.out.println("Total Resources Consumed: " + Resource.getTotalResourcesConsumed());
    }
}

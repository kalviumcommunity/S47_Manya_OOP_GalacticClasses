public class Main {
    public static void main(String[] args) {
        // Creating Astronauts
        Astronaut astronaut1 = new Astronaut("Manya", 5, 3);
        Astronaut astronaut2 = new Astronaut("Hanshul", 4, 2);

        // Using BaseResource references for subclasses
        BaseResource oxygen = new OxygenResource(100);
        BaseResource food = new FoodResource(50);

        // Astronauts consuming resources
        astronaut1.consumeOxygen(oxygen);
        astronaut1.consumeFood(food);

        astronaut2.consumeOxygen(oxygen);
        astronaut2.consumeFood(food);

        // Calling subclass-specific methods
        if (oxygen instanceof OxygenResource) {
            ((OxygenResource) oxygen).filterOxygen();
        }

        if (food instanceof FoodResource) {
            ((FoodResource) food).prepareFood();
        }

        System.out.println("Remaining Oxygen: " + oxygen.getQuantity());
        System.out.println("Remaining Food: " + food.getQuantity());
    }
}

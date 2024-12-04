public class Astronaut {
    // Private data members
    private String name;
    private int oxygenLevel;
    private int foodLevel;

    // Static member to track total astronauts
    private static int totalAstronauts = 0;

    // Constructor
    public Astronaut(String name, int oxygenLevel, int foodLevel) {
        this.name = name;
        this.oxygenLevel = oxygenLevel;
        this.foodLevel = foodLevel;
        totalAstronauts++;
    }

    // Accessor (getter) methods
    public String getName() {
        return name;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    // Mutator (setter) methods
    public void setName(String name) {
        this.name = name;
    }

    public void setOxygenLevel(int oxygenLevel) {
        if (oxygenLevel >= 0) {
            this.oxygenLevel = oxygenLevel;
        } else {
            System.out.println("Oxygen level cannot be negative!");
        }
    }

    public void setFoodLevel(int foodLevel) {
        if (foodLevel >= 0) {
            this.foodLevel = foodLevel;
        } else {
            System.out.println("Food level cannot be negative!");
        }
    }

    // Method to consume oxygen
    public void consumeOxygen() {
        if (oxygenLevel > 0) {
            oxygenLevel--;
            System.out.println(name + " consumed oxygen. Remaining: " + oxygenLevel);
        } else {
            System.out.println(name + " has no oxygen left!");
        }
    }

    // Method to consume food
    public void consumeFood() {
        if (foodLevel > 0) {
            foodLevel--;
            System.out.println(name + " consumed food. Remaining: " + foodLevel);
        } else {
            System.out.println(name + " has no food left!");
        }
    }

    // Static method to get the total number of astronauts
    public static int getTotalAstronauts() {
        return totalAstronauts;
    }
}

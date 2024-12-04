public class Astronaut {
    // Private data members (accessible only within this class)
    private String name;
    private int oxygenLevel;
    private int foodLevel;

    // Public static member (accessible anywhere)
    public static int totalAstronauts = 0;

    // Public constructor
    public Astronaut(String name, int oxygenLevel, int foodLevel) {
        this.name = name;
        this.oxygenLevel = oxygenLevel;
        this.foodLevel = foodLevel;
        totalAstronauts++;
    }

    // Public accessor (getter) methods
    public String getName() {
        return name;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    // Public mutator (setter) methods
    public void setName(String name) {
        this.name = name;
    }

    public void setOxygenLevel(int oxygenLevel) {
        if (oxygenLevel >= 0) {
            this.oxygenLevel = oxygenLevel;
        } else {
            System.out.println("Invalid oxygen level!");
        }
    }

    public void setFoodLevel(int foodLevel) {
        if (foodLevel >= 0) {
            this.foodLevel = foodLevel;
        } else {
            System.out.println("Invalid food level!");
        }
    }

    // Public method to display astronaut info
    public void displayInfo() {
        System.out.println("Astronaut Name: " + name);
        System.out.println("Oxygen Level: " + oxygenLevel);
        System.out.println("Food Level: " + foodLevel);
    }
}

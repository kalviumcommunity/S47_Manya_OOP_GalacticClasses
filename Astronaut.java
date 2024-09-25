public class Astronaut {
    private String name;
    private int oxygenConsumption;
    private int foodConsumption;
    // Static variable created to count the total number of astronauts
    private static int totalAstronauts = 0;

    public Astronaut(String name, int oxygenConsumption, int foodConsumption) {
        this.name = name;
        this.oxygenConsumption = oxygenConsumption;
        this.foodConsumption = foodConsumption;
        totalAstronauts++;  
    }

    public int consumeOxygen() {
        System.out.println(name + " is consuming " + oxygenConsumption + " units of oxygen.");
        return oxygenConsumption;
    }

    public int consumeFood() {
        System.out.println(name + " is consuming " + foodConsumption + " units of food.");
        return foodConsumption;
    }

    // Static method created to get the total number of astronauts
    public static int getTotalAstronauts() {
        return totalAstronauts;
    }

    public String getName() {
        return name;
    }
}

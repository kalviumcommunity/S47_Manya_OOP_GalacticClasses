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

    public void consumeOxygen() {
        System.out.println(name + " is consuming " + oxygenConsumption + " units of oxygen.");
    }

    public void consumeFood() {
        System.out.println(name + " is consuming " + foodConsumption + " units of food.");
    }

    // Static method  created to get the total number of astronauts
    public static int getTotalAstronauts() {
        return totalAstronauts;
    }

    // Static method created to display astronaut information
    public static void displayAstronautInfo(Astronaut astronaut) {
        System.out.println("Astronaut Name: " + astronaut.name);
        System.out.println("Oxygen Consumption: " + astronaut.oxygenConsumption);
        System.out.println("Food Consumption: " + astronaut.foodConsumption);
    }
}

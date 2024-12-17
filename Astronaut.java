public class Astronaut {
    private String name;
    private int oxygenConsumption;
    private int foodConsumption;
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

    public String getName() {
        return name;
    }

    public static int getTotalAstronauts() {
        return totalAstronauts;
    }
}

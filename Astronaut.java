public class Astronaut {
    private String name;
    private int oxygenConsumption;
    private int foodConsumption;

    public Astronaut(String name, int oxygenConsumption, int foodConsumption) {
        this.name = name;
        this.oxygenConsumption = oxygenConsumption;
        this.foodConsumption = foodConsumption;
    }

    public int consumeOxygen() {
        System.out.println(name + " is consuming " + oxygenConsumption + " units of oxygen.");
        return oxygenConsumption;
    }

    public int consumeFood() {
        System.out.println(name + " is consuming " + foodConsumption + " units of food.");
        return foodConsumption;
    }

    public String getName() {
        return name;
    }
}

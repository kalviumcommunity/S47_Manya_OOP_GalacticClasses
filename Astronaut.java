public class Astronaut {
    private String name;
    private int oxygenConsumption;
    private int foodConsumption;

    public Astronaut(String name, int oxygenConsumption, int foodConsumption) {
        this.name = name;
        this.oxygenConsumption = oxygenConsumption;
        this.foodConsumption = foodConsumption;
    }

    public void consumeOxygen(BaseResource oxygen) {
        System.out.println(name + " is consuming " + oxygenConsumption + " units of oxygen.");
        oxygen.consume(oxygenConsumption);
    }

    public void consumeFood(BaseResource food) {
        System.out.println(name + " is consuming " + foodConsumption + " units of food.");
        food.consume(foodConsumption);
    }

    public String getName() {
        return name;
    }
}

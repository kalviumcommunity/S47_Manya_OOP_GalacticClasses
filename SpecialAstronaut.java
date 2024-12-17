public class SpecialAstronaut extends Astronaut {
    private int bonusConsumption;

    // Constructor for SpecialAstronaut
    public SpecialAstronaut(String name, int oxygenConsumption, int foodConsumption, int bonusConsumption) {
        super(name, oxygenConsumption, foodConsumption);
        this.bonusConsumption = bonusConsumption;
    }

    // Overriding method to include bonus oxygen consumption
    @Override
    public void consumeOxygen() {
        System.out.println("Special Astronaut: " + getName() + " is consuming additional " + bonusConsumption + " bonus units of oxygen.");
        super.consumeOxygen();
    }
}

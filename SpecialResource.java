public class SpecialResource extends Resource {
    private int bonusSupply;

    public SpecialResource(String resourceName, int quantity, int bonusSupply) {
        super(resourceName, quantity);
        this.bonusSupply = bonusSupply;
    }

    // New method to provide bonus resources
    public void provideBonusSupply() {
        System.out.println("Providing bonus " + bonusSupply + " units of resources.");
        reload(bonusSupply);
    }
}

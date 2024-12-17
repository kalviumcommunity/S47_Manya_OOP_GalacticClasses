public class OxygenResource extends BaseResource {

    public OxygenResource(int quantity) {
        super("Oxygen", quantity);
    }

    public void filterOxygen() {
        System.out.println("Oxygen is being filtered for purity.");
    }
}

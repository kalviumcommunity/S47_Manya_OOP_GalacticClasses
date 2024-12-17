public class FoodResource extends BaseResource {

    public FoodResource(int quantity) {
        super("Food", quantity);
    }

    public void prepareFood() {
        System.out.println("Food is being prepared for consumption.");
    }
}

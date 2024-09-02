public class Main {
    public static void main(String[] args) {
        
        Astronaut astronaut1 = new Astronaut("Manya", 5, 3);
        Astronaut astronaut2 = new Astronaut("Ishita", 4, 2);

        astronaut1.consumeOxygen();
        astronaut1.consumeFood();

        astronaut2.consumeOxygen();
        astronaut2.consumeFood();

        Resource oxygen = new Resource("Oxygen", 100);
        Resource food = new Resource("Food", 50);

        oxygen.consume(10);
        oxygen.reload(20);

        food.consume(15);
        food.reload(10);
    }
}

package ToyShop;

public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        toyShop.addToy("Doll", 5);
        toyShop.addToy("Car", 3);
        toyShop.addToy("Bear", 2);

        toyShop.addToy("Puzzle", 4);
        toyShop.addToy("Figures", 3);
        toyShop.addToy("Board Game", 3);
        toyShop.addToy("Robot", 2);

        toyShop.run();
    }
}

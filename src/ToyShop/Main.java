package ToyShop;

public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        toyShop.addToy("toy car", 8);
        toyShop.addToy("doll", 6);
        toyShop.addToy("toy train", 9);

        toyShop.addToy("scooter", 10);
        toyShop.addToy("robot", 5);
        toyShop.addToy("drum", 23);
        toyShop.addToy("board game", 7);

        toyShop.run();
    }
}

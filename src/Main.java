package ToyShop;

public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        // Добавление новых игрушек с заданными весами
        toyShop.addToy("Doll", 5);
        toyShop.addToy("Car", 3);
        toyShop.addToy("Teddy Bear", 2);

        // Добавление еще нескольких игрушек с их весами
        toyShop.addToy("Puzzle", 4);
        toyShop.addToy("Action Figure", 3);
        toyShop.addToy("Board Game", 3);
        toyShop.addToy("Robot", 2);

        // Запуск розыгрыша
        toyShop.run();
    }
}

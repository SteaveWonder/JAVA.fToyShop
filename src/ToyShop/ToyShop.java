package ToyShop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyShop {
    private PriorityQueue<Toy> toyQueue;
    private Random random;

    public ToyShop() {
        toyQueue = new PriorityQueue<>((t1, t2) -> t2.frequency - t1.frequency);
        random = new Random();
    }

    public void addToy(String name, int frequency) {
        int id = toyQueue.size() + 1; // Generate a unique id for each toy
        Toy toy = new Toy(id, name, frequency);
        toyQueue.add(toy);
    }

    public void run() {
        try {
            File outputFile = new File("LIST.txt");
            FileWriter writer = new FileWriter(outputFile);

            for (int i = 0; i < 10; i++) {
                Toy selectedToy = getRandomToy();
                if (selectedToy != null) {
                    String result = "Get " + (i + 1) + ": Toy " + selectedToy.name + " (ID: " + selectedToy.id + ")\n";
                    writer.write(result);
                }
            }

            writer.close();
            System.out.println("Result.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Toy getRandomToy() {
        List<Toy> toysList = new ArrayList<>(toyQueue);
        if (toysList.isEmpty()) {
            return null;
        }
        int randomIndex = random.nextInt(toysList.size());
        return toysList.get(randomIndex);
    }
}
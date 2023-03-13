import com.skwaweru254.Bird;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bird penguin = new Bird();
        penguin.getAge();
        penguin.getWeight();
        penguin.getColor();

        penguin.setAge(4);
        penguin.setWeight(14);
        penguin.setColor("black");

    }
}
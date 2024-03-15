import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;
    private double weight;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
        weight += fruitWeight(fruit);
    }

    public double fruitWeight(T fruit) {
        if (fruit instanceof Apple) {
            weight = 1.0;
        } else if (fruit instanceof Orange) {
            weight = 1.5;
        } else {
            weight = 0;
        }
        return weight;
    }

    public double getWeight() {
        return weight;
    }

    public boolean compareWeight(Box<?> box) {
        return Double.compare(this.getWeight(), box.getWeight()) == 0;
    }

    public void pourFruits(Box<T> box) {
        for(T fruit : fruits) {
            box.addFruit(fruit);
        }
        fruits.clear();
        weight = 0;
    }

}

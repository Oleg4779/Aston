public class Animal {
    private String name;
    private static int animalsAmount;

    public Animal() {
        animalsAmount += 1;
    }

    public Animal(String name) {
        this.name = name;
        animalsAmount += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAnimalsAmount() {
        return animalsAmount;
    }

    public static void setAnimalsAmount(int animalsAmount) {
        Animal.animalsAmount = animalsAmount;
    }

    public void run(int distanceLength) {
        System.out.println(this.name + " runs " + distanceLength + " m.");
    }

    public void swim(int distanceLength) {
        System.out.println(this.name + " swam " + distanceLength + " m.");
    }
}

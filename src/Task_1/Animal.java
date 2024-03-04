package Task_1;

public class Animal {
    private String name;
    private static int animalsAmount;
    private final int maxRun;
    private final int maxSwim;

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        animalsAmount++;
    }

    public String getName() {
        return name;
    }

    public static int getAnimalsAmount() {
        return animalsAmount;
    }

    public int getMaxRun() {
        return this.maxRun;
    }

    public int getMaxSwim() {
        return this.maxSwim;
    }

    public void run(int distanceLength) {
        if(distanceLength <= maxRun) {
            System.out.println(this.name + " runs " + distanceLength + " m.");
        } else {
            System.out.println("Task_1.Animal can't run this distance");
        }
    }

    public void swim(int distanceLength) {
        if(distanceLength <= maxSwim) {
            System.out.println(this.name + " swam " + distanceLength + " m.");
        } else {
            System.out.println("Task_1.Animal can't swim this distance");
        }
    }
}

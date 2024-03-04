package Task_1;

public class Dog extends Animal {
    private static int dogsAmount;

    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        dogsAmount++;
    }

    public static int getDogsAmount() {
        return dogsAmount;
    }

    @Override
    public void run(int distanceLength) {
        if (distanceLength > getMaxRun()) {
            System.out.println("Dog can't run so much");
        } else {
            super.run(distanceLength);
        }
    }

    @Override
    public void swim(int distanceLength) {
        if (distanceLength > getMaxSwim()) {
            System.out.println("Dog can't swim so much");
        } else {
            super.swim(distanceLength);
        }
    }
}

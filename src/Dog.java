public class Dog extends Animal {
    private static int dogsAmount;

    public Dog() {
        dogsAmount += 1;
    }

    public Dog(String name) {
        super(name);
        dogsAmount += 1;
    }

    public static int getDogsAmount() {
        return dogsAmount;
    }

    public static void setDogsAmount(int dogsAmount) {
        Dog.dogsAmount = dogsAmount;
    }

    @Override
    public void run(int distanceLength) {
        if (distanceLength > 500) {
            System.out.println("Dog can't run so much");
        } else {
            super.run(distanceLength);
        }
    }

    @Override
    public void swim(int distanceLength) {
        if (distanceLength > 10) {
            System.out.println("Dog can't swim so much");
        } else {
            super.swim(distanceLength);
        }
    }
}

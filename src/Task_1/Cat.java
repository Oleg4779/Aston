package Task_1;

public class Cat extends Animal {
    private static int catsAmount;
    private boolean satiety = false;
    private int minFoodAmount;

    public Cat(String name, int maxRun, int maxSwim, int minFoodAmount) {
        super(name, maxRun, maxSwim);
        this.minFoodAmount = minFoodAmount;
        catsAmount++;
    }

    public static int getCatsAmount() {
        return catsAmount;
    }

    @Override
    public void run(int distanceLength) {
        if (distanceLength > getMaxRun()) {
            System.out.println("Cats can't run so much");
        } else {
            super.run(distanceLength);
        }
    }

    @Override
    public void swim(int distanceLength) {
        System.out.println("Cats can't swim");
    }

    public void eat(Food food) {
        if(food.getFoodAmountInPlate() >= minFoodAmount) {
            satiety = true;
            food.setFoodAmountInPlate(food.getFoodAmountInPlate() - minFoodAmount);
            System.out.println("Cat " + this.getName() + " is fed up");
        } else {
            System.out.println("Cat " + this.getName() + " is hungry because to few food in the plate");
        }
    }
}

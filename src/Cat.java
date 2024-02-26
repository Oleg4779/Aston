public class Cat extends Animal {
    private static int catsAmount;
    private boolean satiety;
    private int minFoodAmount;

    public Cat() {
        catsAmount += 1;
    }

    public Cat(String name) {
        super(name);
        this.satiety = false;
        catsAmount += 1;
    }

    public Cat(String name, int minFoodAmount) {
        super(name);
        this.minFoodAmount = minFoodAmount;
        catsAmount += 1;
    }

    public static int getCatsAmount() {
        return catsAmount;
    }

    public static void setCatsAmount(int catsAmount) {
        Cat.catsAmount = catsAmount;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getMinFoodAmount() {
        return minFoodAmount;
    }

    public void setMinFoodAmount(int minFoodAmount) {
        this.minFoodAmount = minFoodAmount;
    }

    @Override
    public void run(int distanceLength) {
        if (distanceLength > 200) {
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

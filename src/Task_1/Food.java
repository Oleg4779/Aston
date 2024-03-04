package Task_1;

public class Food {
    private int foodAmountInPlate;

    public Food() {
    }

    public Food(int foodAmountInPlate) {
        this.foodAmountInPlate = foodAmountInPlate;
    }

    public int getFoodAmountInPlate() {
        return foodAmountInPlate;
    }

    public void setFoodAmountInPlate(int foodAmountInPlate) {
        this.foodAmountInPlate = foodAmountInPlate;
    }

    public void addFood(int amountToAdd) {
        setFoodAmountInPlate(this.getFoodAmountInPlate() + amountToAdd);
    }
}

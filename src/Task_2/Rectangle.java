package Task_2;

public class Rectangle extends Figure implements Calculable {
    private int aSide;
    private int bSide;

    public Rectangle(String borderColor, String fillColor, int aSide, int bSide) {
        super(borderColor, fillColor);
        this.aSide = aSide;
        this.bSide = bSide;
    }

//    public int getaSide() {
//        return aSide;
//    }
//
//    public void setaSide(int aSide) {
//        this.aSide = aSide;
//    }
//
//    public int getbSide() {
//        return bSide;
//    }
//
//    public void setbSide(int bSide) {
//        this.bSide = bSide;
//    }

    @Override
    public double calculatePerimeter() {
        return (2 * aSide) + (2 * bSide);
    }

    @Override
    public double calculateArea() {
        return aSide * bSide;
    }

    @Override
    public String toString() {
        return "Task_2.Rectangle. Perimeter: " + calculatePerimeter() + ", area: " + calculateArea() +
                ", fill color: " + getFillColor() + ", border color: " + getBorderColor();
    }
}

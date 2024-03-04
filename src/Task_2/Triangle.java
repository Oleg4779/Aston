package Task_2;

public class Triangle extends Figure implements Calculable {
    private int aSide;
    private int bSide;
    private int cSide;

    public Triangle(String borderColor, String fillColor, int aSide, int bSide, int cSide) {
        super(borderColor, fillColor);
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public int getaSide() {
        return aSide;
    }

    public void setaSide(int aSide) {
        this.aSide = aSide;
    }

    public int getbSide() {
        return bSide;
    }

    public void setbSide(int bSide) {
        this.bSide = bSide;
    }

    public int getcSide() {
        return cSide;
    }

    public void setcSide(int cSide) {
        this.cSide = cSide;
    }

    @Override
    public double calculatePerimeter() {
        return aSide + bSide + cSide;
    }

    @Override
    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - aSide) * (halfPerimeter - bSide) *
                (halfPerimeter - cSide));
    }

    @Override
    public String toString() {
        return "Task_2.Triangle. Perimeter: " + calculatePerimeter() + ", area: " +
                calculateArea() + ", fill color: " + getFillColor() +
                ", border color: " + getBorderColor();
    }
}
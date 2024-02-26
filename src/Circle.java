public class Circle extends Figure implements Calculable {
    private int radius;

    public Circle(String borderColor, String fillColor, int radius) {
        super(borderColor, fillColor);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI) * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * (getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return "Circle. Perimeter: " + calculatePerimeter() + ", area: " + calculateArea() +
                ", fill color: " + getFillColor() + ", border color: " + getBorderColor();
    }
}
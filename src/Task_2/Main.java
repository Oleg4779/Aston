package Task_2;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Black", "Yellow", 5, 8);
        System.out.println(rectangle.toString());
        Circle circle = new Circle("Grey", "Red", 90);
        System.out.println(circle.toString());
        Triangle triangle = new Triangle("Blue", "White", 18, 15, 9);
        System.out.println(triangle.toString());
    }
}

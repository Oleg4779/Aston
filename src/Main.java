public class Main {
    public static void main(String[] args) {

//        task 1

        Animal dog1 = new Dog("Charlie");
        Dog dog2 = new Dog("Freddy");
        dog1.run(600);
        dog1.swim(9);
        dog2.run(400);
        dog2.swim(20);
        Animal cat1 = new Cat("Oscar");
        Cat cat2 = new Cat("Wiskas", 10);
        cat1.run(220);
        cat1.swim(10);
        cat2.run(150);

        System.out.println("Dogs created: " + Dog.getDogsAmount());
        System.out.println("Cats created: " + Cat.getCatsAmount());
        System.out.println("Total animals created: " + Animal.getAnimalsAmount());

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Simba", 25);
        cats[1] = new Cat("Tom", 10);
        cats[2] = new Cat("Bob", 8);
        cats[3] = new Cat("Max", 10);
        cats[4] = new Cat("Felix", 4);

        Food food = new Food(20);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(food);
        }

//        task 2

        Rectangle rectangle = new Rectangle("Black", "Yellow", 5, 8);
        System.out.println(rectangle.toString());
        Circle circle = new Circle("Grey", "Red", 90);
        System.out.println(circle.toString());
        Triangle triangle = new Triangle("Blue", "White", 18, 15, 9);
        System.out.println(triangle.toString());
    }
}

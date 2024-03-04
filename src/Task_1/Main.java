package Task_1;

public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Charlie", 500, 10);
        Dog dog2 = new Dog("Freddy", 500, 10);
        dog1.run(600);
        dog1.swim(9);
        dog2.run(400);
        dog2.swim(20);
        Animal cat1 = new Cat("Oscar",200, 0, 10);
        Cat cat2 = new Cat("Wiskas", 200, 0, 25);
        cat1.run(220);
        cat1.swim(10);
        cat2.run(150);

        System.out.println("Dogs created: " + Dog.getDogsAmount());
        System.out.println("Cats created: " + Cat.getCatsAmount());
        System.out.println("Total animals created: " + Animal.getAnimalsAmount());

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Simba", 200, 0,25);
        cats[1] = new Cat("Tom",200, 0,10);
        cats[2] = new Cat("Bob", 200, 0,8);
        cats[3] = new Cat("Max",200, 0,10);
        cats[4] = new Cat("Felix",200, 0,4);

        Food food = new Food(20);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(food);
        }
    }
}

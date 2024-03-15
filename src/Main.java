public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        System.out.println("Apple box-1 weight = " + appleBox1.getWeight());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        System.out.println("Orange box-1 weight = " + orangeBox1.getWeight());
        System.out.println("Compare apple box-1 and orange box-1 weight: " + appleBox1.compareWeight(orangeBox1));

        Box<Apple> appleBox2 = new Box<>();
        appleBox1.pourFruits(appleBox2);
        System.out.println("Pour apples from box-1 to box-2.");
        System.out.println("Apple box-1 weight = " + appleBox1.getWeight());
        System.out.println("Apple box-2 weight = " + appleBox2.getWeight());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        orangeBox1.pourFruits(orangeBox2);
        System.out.println("Pour oranges from box-1 to box-2.");
        System.out.println("Orange box-1 weight = " + orangeBox1.getWeight());
        System.out.println("Orange box-2 weight = " + orangeBox2.getWeight());
    }
}

package Animal;
public class Main {
    public static void main(String[] args) {
        System.out.println("Animal behaviors ");
        Animals animal = new Animals() {
            @Override
            public void eat() {
                System.out.println("food");
            }

            @Override
            public void makeSounds() {
                System.out.println("make sounds");
            }
        };
        animal.sleep();
        animal.walk();
        animal.makeSounds();
        animal.eat();
        System.out.println();
        System.out.println("Dog :");
        Animals dog = new Animals() {
            @Override
            public void eat() {
                System.out.println("dog food , bones");
            }

            @Override
            public void makeSounds() {
                System.out.println("wooof wof");
            }
        };
        dog.eat();
        dog.makeSounds();
        dog.walk();
        dog.sleep();

        System.out.println();
        System.out.println("Cat");
        Cat cat = new Cat();
        cat.walk();
        cat.eat();
        cat.sleep();
        cat.makeSounds();
        System.out.println();
        System.out.println("Cat test behavior");
        Animals catTest = new Animals() {
            @Override
            public void eat() {
                System.out.println("cat food , fish ");
            }

            @Override
            public void makeSounds() {
                System.out.println("Meeeeoooww");
            }
        };
        catTest.walk();
        catTest.sleep();
        System.out.println();
        catTest.makeSounds();
        catTest.eat();

    }
}

package Animal;

public abstract class Animals {
    public void walk() {
        System.out.println("This animal walk ");
    }

    public void sleep() {
        System.out.println("ZzZzzZzZ");
    }

    public abstract void eat();

    public abstract void makeSounds();
}

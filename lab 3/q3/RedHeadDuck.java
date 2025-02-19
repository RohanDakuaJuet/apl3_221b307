package lab3.q3;

class RedHeadDuck implements Swimable, Flyable, Quackable {
    public void swim() {
        System.out.println("RedHead Duck swims.");
    }
    public void fly() {
        System.out.println("RedHead Duck flies.");
    }
    public void quack() {
        System.out.println("RedHead Duck quacks.");
    }
}

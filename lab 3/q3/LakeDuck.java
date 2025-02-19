package lab3.q3;

class LakeDuck implements Swimable, Flyable, Quackable {
    public void swim() {
        System.out.println("Lake Duck swims.");
    }
    public void fly() {
        System.out.println("Lake Duck flies.");
    }
    public void quack() {
        System.out.println("Lake Duck quacks.");
    }
}

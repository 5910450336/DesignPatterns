package lab8.AdapterPattern;

public class RubberDuck implements Quackable, lab8.DecoratorPattern.Quackable {
    public void quack() {
        System.out.println("Squeak");
    }
}
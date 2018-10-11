package AdapterPattern;

public class RubberDuck implements Quackable, DecoratorPattern.Quackable {
    public void quack() {
        System.out.println("Squeak");
    }
}
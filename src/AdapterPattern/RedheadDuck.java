package AdapterPattern;

public class RedheadDuck implements Quackable, DecoratorPattern.Quackable {
    public void quack() {
        System.out.println("Quack");
    }
}
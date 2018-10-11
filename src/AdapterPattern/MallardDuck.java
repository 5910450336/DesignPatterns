package AdapterPattern;

public class MallardDuck implements Quackable, DecoratorPattern.Quackable {
    public void quack() {
        System.out.println("Quack");
    }
}
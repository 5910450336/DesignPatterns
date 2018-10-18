package lab8.AdapterPattern;

public class MallardDuck implements Quackable, lab8.DecoratorPattern.Quackable {
    public void quack() {
        System.out.println("Quack");
    }
}
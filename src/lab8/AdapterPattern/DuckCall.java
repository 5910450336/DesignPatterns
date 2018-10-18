package lab8.AdapterPattern;

public class DuckCall implements Quackable, lab8.DecoratorPattern.Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}

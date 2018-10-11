package AdapterPattern;

public class DuckCall implements Quackable, DecoratorPattern.Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}

package DecoratorPattern;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        //Quackable mallardDuck = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        //Quackable redheadDuck = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Goose Decorator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
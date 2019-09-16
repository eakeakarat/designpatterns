package simulator;

import ducks.*;
import notDucks.*;
import option.*;

public class DecoratorSimulator {
    public static void main(String[] args) {
        DecoratorSimulator simulator = new DecoratorSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable gooseDuck = new QuackEcho(new GooseAdapter(new Goose()));
        Quackable pigeonDuck = new QuackEcho(new PigeonAdapter(new Pigeon()));

        System.out.println("\nDuck Simulator: With Decorator");
        simulate(mallardDuck); //quack x2
        simulate(redheadDuck); //quack x2
        simulate(duckCall); //kwak x2
        simulate(rubberDuck); //squeak x2
        simulate(gooseDuck); //honk x2
        simulate(pigeonDuck); //coocoo x2
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
package simulator;

import notDucks.*;
import option.*;

public class AbstractFactorySimulator {
    public static void main(String[] args) {
        AbstractFactorySimulator simulator = new AbstractFactorySimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        // With counter
        Quackable mallardDuckWithCounter = duckFactory.createMallardDuckWithCounter();
        Quackable redheadDuckWithCounter = duckFactory.createRedheadDuckWithCounter();
        Quackable duckCallWithCounter = duckFactory.createDuckCallWithCounter();
        Quackable rubberDuckWithCounter = duckFactory.createRubberDuckWithCounter();

        // With counter and echo
        Quackable mallardDuckWithCounterAndEcho = duckFactory.createMallardDuckWithCounterAndEcho();
        Quackable redheadDuckWithCounterAndEcho = duckFactory.createRedheadDuckWithCounterAndEcho();
        Quackable duckCallWithCounterAndEcho = duckFactory.createDuckCallWithCounterAndEcho();
        Quackable rubberDuckWithCounterAndEcho = duckFactory.createRubberDuckWithCounterAndEcho();


        System.out.println("\nDuck Simulator: With Adapter");
        simulate(mallardDuck); //quack
        simulate(redheadDuck); //quack
        simulate(duckCall); //kwak
        simulate(rubberDuck); //squeak
        simulate(gooseDuck); //honk
        simulate(pigeonDuck); //coo \n coo

        System.out.println("\nDuck Simulator: With Counter Decorator");
        simulate(mallardDuckWithCounter); //quack
        simulate(redheadDuckWithCounter); //quack
        simulate(duckCallWithCounter); //kwak
        simulate(rubberDuckWithCounter); //squeak
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");

        //clear quack counter
        QuackCounter.clear();

        System.out.println("\nDuck Simulator: With Counter and Echo Decorator");
        simulate(mallardDuckWithCounterAndEcho); //quack x2
        simulate(redheadDuckWithCounterAndEcho); //quack x2
        simulate(duckCallWithCounterAndEcho); //kwak x2
        simulate(rubberDuckWithCounterAndEcho); //squeak x2
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");

    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
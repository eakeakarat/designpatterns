package simulator;

import notDucks.*;
import option.*;

public class FlockSimulator {
    public static void main(String[] args) {
        FlockSimulator simulator = new FlockSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuckWithCounter();
        Quackable duckCall = duckFactory.createDuckCallWithCounter();
        Quackable rubberDuck = duckFactory.createRubberDuckWithCounter();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Composite");

        //all duck except mallard
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(pigeonDuck);

        //only mallard
        Quackable mallardOne = duckFactory.createMallardDuckWithCounter();
        Quackable mallardTwo = duckFactory.createMallardDuckWithCounter();
        Quackable mallardThree = duckFactory.createMallardDuckWithCounter();
        Quackable mallardFour = duckFactory.createMallardDuckWithCounter();
        Quackable mallardFive = duckFactory.createMallardDuckWithCounter();
        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        flockOfMallards.add(mallardFive);

        //only mallard
        System.out.println("\nFlock of Mallard");
        simulate(flockOfMallards);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
        QuackCounter.clear();

        //except mallard
        System.out.println("\nFlock of Other Duck");
        simulate(flockOfDucks);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
        QuackCounter.clear();

        //add mallard to flock of duck
        flockOfDucks.add(flockOfMallards);
        System.out.println("\nFlock of Duck after add mallard");
        simulate(flockOfDucks);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");

    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}

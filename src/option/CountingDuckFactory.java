package option;

import ducks.*;

public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createMallardDuckWithCounter() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuckWithCounter() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuckWithCounter() {
        return new QuackCounter(new RubberDuck());

    }

    @Override
    public Quackable createDuckCallWithCounter() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createMallardDuckWithCounterAndEcho() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuckWithCounterAndEcho() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }

    @Override
    public Quackable createRubberDuckWithCounterAndEcho() {
        return new QuackCounter(new QuackEcho(new RubberDuck()));
    }

    @Override
    public Quackable createDuckCallWithCounterAndEcho() {
        return new QuackCounter(new QuackEcho(new DuckCall()));
    }
}

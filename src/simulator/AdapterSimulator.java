package simulator;

import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import notDucks.Goose;
import notDucks.GooseAdapter;
import notDucks.Pigeon;
import notDucks.PigeonAdapter;
import option.Quackable;

public class AdapterSimulator {
    public static void main(String[] args) {
        AdapterSimulator simulator = new AdapterSimulator();
        simulator.simulate();
    }
    void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
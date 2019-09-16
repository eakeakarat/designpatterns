package option;

import java.util.ArrayList;

public class Flock implements Quackable {
    private ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        for (Quackable q : quackers) {
            q.quack();
        }
    }
}

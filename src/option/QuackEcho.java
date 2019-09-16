package option;

public class QuackEcho implements Quackable {
    Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    public void quack(){
        this.duck.quack();
        System.out.print("Echo :");
        this.duck.quack();
    }



}

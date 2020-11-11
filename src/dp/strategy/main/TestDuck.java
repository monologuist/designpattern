package dp.strategy.main;

import dp.strategy.CanFly;
import dp.strategy.CanNotFly;
import dp.strategy.CanNotQuack;
import dp.strategy.CanQuack;

public class TestDuck {
    public static void main(String[] args) {
        //能飞能叫
        Duck d1 = new GreenDuck(new CanFly(), new CanQuack());
        d1.play();

        //能叫不能飞
        Duck d2 = new RubberDuck(new CanNotFly(), new CanQuack());
        d2.play();

        //能叫不能飞
        Duck d3 = new BJDuck(new CanNotFly(), new CanNotQuack());
        d3.play();
    }
}

package dp.strategy.main;

import dp.strategy.FlyBav;
import dp.strategy.QuackBav;

public class RubberDuck extends Duck{
    //构造函数
    public RubberDuck(FlyBav fBav, QuackBav qBav){
        super(fBav,qBav);
    }
    @Override
    public void display() {
        System.out.println("我是一只橡皮鸭子");
    }
}

package dp.strategy.main;

import dp.strategy.FlyBav;
import dp.strategy.QuackBav;

/**
 * 鸭子的子类
 */
public class GreenDuck extends Duck{
    //构造函数
    public GreenDuck(FlyBav fBav, QuackBav qBav){
        super(fBav,qBav);
    }

    @Override
    public void display() {
        System.out.println("我是一只绿鸭子");
    }
}

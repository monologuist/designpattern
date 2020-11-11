package dp.strategy.main;

import dp.strategy.FlyBav;
import dp.strategy.QuackBav;

public class BJDuck extends Duck{
    //构造函数
    public BJDuck(FlyBav fBav, QuackBav qBav){
        super(fBav,qBav);
    }

    @Override
    public void display() {
        System.out.println("香喷喷的北京烤鸭");
    }
}

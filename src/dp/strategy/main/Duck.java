package dp.strategy.main;

import dp.strategy.FlyBav;
import dp.strategy.QuackBav;

/**
 * 鸭子父类
 */
public abstract class Duck {
    //飞的行为
    protected FlyBav fBav;
    //叫的行为
    protected QuackBav qBav;

    //构造函数
    public Duck(FlyBav fBav,QuackBav qBav){
        this.fBav=fBav;
        this.qBav=qBav;
    }

    //子类实现
    public abstract void display();

    //飞的方法
    public void fly(){
        //委托给了飞的行为的飞方法
        fBav.fly();
    }

    //叫的方法
    public void quack(){
        //委托给了叫的行为的叫方法
        qBav.quack();
    }

    //开始游戏
    public void play(){
        this.display();
        this.fly();
        this.quack();
    }
}

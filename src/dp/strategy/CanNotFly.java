package dp.strategy;
/**
 * 飞行行为:实现2
 */
public class CanNotFly implements FlyBav{
    @Override
    public void fly() {
        System.out.println("我不能飞！");
    }
}

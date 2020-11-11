package dp.strategy;
/**
 * 叫行为:实现1
 */
public class CanQuack implements QuackBav{
    @Override
    public void quack() {
        System.out.println("我能叫！");
    }
}

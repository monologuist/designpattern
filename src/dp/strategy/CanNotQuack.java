package dp.strategy;
/**
 * 叫行为:实现2
 */
public class CanNotQuack implements QuackBav{
    @Override
    public void quack() {
        System.out.println("我不能叫！");
    }
}

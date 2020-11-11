package dp.factory.method;

import dp.factory.simple.BenZ;
import dp.factory.simple.Car;

/**
 * 创建奔驰汽车工厂
 */
public class BenZFactory implements MethodCarFactory{
    @Override
    //返回具体的汽车
    public Car creatCar() {
        return new BenZ();
    }
}

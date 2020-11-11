package dp.factory.method;

import dp.factory.simple.Car;

/**
 * 汽车工厂的接口
 * 经过测试，发现工厂方法是符合OCP的
 */
public interface MethodCarFactory {
    public Car creatCar();
}

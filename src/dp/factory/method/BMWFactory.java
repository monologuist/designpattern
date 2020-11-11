package dp.factory.method;

import dp.factory.simple.BMW;
import dp.factory.simple.Car;

/**
 * 创建宝马汽车工厂
 */
public class BMWFactory implements MethodCarFactory{
    @Override
    public Car creatCar() {
        return new BMW();
    }
}

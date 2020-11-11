package dp.factory.method;

import dp.factory.simple.Car;
import dp.factory.simple.Jeep;

/**
 * jeep工厂
 */
public class JeepFactory implements MethodCarFactory{
    @Override
    public Car creatCar() {
        return new Jeep();
    }
}

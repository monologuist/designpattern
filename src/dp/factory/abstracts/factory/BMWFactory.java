package dp.factory.abstracts.factory;

import dp.factory.abstracts.product.BMWCar;
import dp.factory.abstracts.product.BMWSuv;
import dp.factory.abstracts.product.ICar;
import dp.factory.abstracts.product.ISuv;

/**
 * 宝马族的工厂
 */
public class BMWFactory extends AbstractFactory{
    @Override
    public ICar creatCar() {
        return new BMWCar();
    }

    @Override
    public ISuv creatSuv() {
        return new BMWSuv();
    }
}

package dp.factory.abstracts.factory;

import dp.factory.abstracts.product.BenZCar;
import dp.factory.abstracts.product.BenZSuv;
import dp.factory.abstracts.product.ICar;
import dp.factory.abstracts.product.ISuv;
/**
 * 奔驰族的工厂
 */
public class BenZFactory extends AbstractFactory{
    @Override
    public ICar creatCar() {
        return new BenZCar();
    }

    @Override
    public ISuv creatSuv() {
        return new BenZSuv();
    }
}

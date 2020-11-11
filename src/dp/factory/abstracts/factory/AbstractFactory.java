package dp.factory.abstracts.factory;

import dp.factory.abstracts.product.ICar;
import dp.factory.abstracts.product.ISuv;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    public abstract ICar creatCar();
    public abstract ISuv creatSuv();
}

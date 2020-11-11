package dp.factory.abstracts;

import dp.factory.abstracts.factory.BMWFactory;
import dp.factory.abstracts.factory.BenZFactory;
import dp.factory.abstracts.product.ICar;
import dp.factory.abstracts.product.ISuv;

public class TestCar {
    public static void main(String[] args) {
        ICar c1 = new BenZFactory().creatCar();
        System.out.println(c1.getName());

        ISuv s1 = new BMWFactory().creatSuv();
        System.out.println(s1.getName());
    }
    //从一个交叉的状态下创建对象
}

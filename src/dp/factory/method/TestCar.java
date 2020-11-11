package dp.factory.method;

import dp.factory.simple.Car;
import dp.factory.simple.Jeep;

public class TestCar {
    public static void main(String[] args) {
        //调用宝马汽车工厂的创建
        Car c1 =new BMWFactory().creatCar();
        System.out.println(c1.getName());

        Car c2 =new JeepFactory().creatCar();
        System.out.println(c2.getName());
    }
}

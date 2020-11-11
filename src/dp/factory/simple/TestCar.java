package dp.factory.simple;

public class TestCar {
    public static void main(String[] args) {

//        Car c1 = SimpleCarFactory.creatCar("BMW");
        /**
         * name不能直接传，万一写错了怎么办？一般来讲做一个常量类Constant
         * 利用常量类来定义不容易写错-小技巧
         */
        Car c1 = SimpleCarFactory.creatCar(Constant.CAR_BMW);
        System.out.println(c1.getName());
    }
}

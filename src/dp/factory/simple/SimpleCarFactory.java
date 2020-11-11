package dp.factory.simple;

/**
 * 简单工厂（静态工厂）
 */
public class SimpleCarFactory {
    /**
     * 汽车的创建方法
     * @param name 汽车名字
     * @return 汽车
     */
    public static Car creatCar(String name){
        //传入BMW 用常量类来做
        if (Constant.CAR_BMW.equals(name)){
            return new BMW();
        }
        //传入BenZ 用常量类来做
        if (Constant.CAR_BenZ.equals(name)){
            return new BenZ();
        }
        return null;

        /*//传入BMW
        if ("BWM".equals(name)){
            return new BMW();
        }
        //传入BenZ
        if ("BenZ".equals(name)){
            return new BenZ();
        }
        return null;*/


        /**
         * 缺点：简单工厂是一种硬编码的形式，如果想再加一个jeep呢？就要修改核心类-SimpleCarFactory 的代码类
         * 这其实违反类开放封闭原则
         * 优点：简单，功能单一
         */
    }
}

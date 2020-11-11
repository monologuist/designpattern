package dp.single.hunger;

import dp.single.lazy.LazySingleton;
/**
 * 单例模式实现2：饥汉式
 */
public class HungerSingleton {
    //第一次初始化就创建对象
    private static HungerSingleton instance = new HungerSingleton();

    /**
     * 1.构造函数私有化
     */
    private HungerSingleton(){

    }

    /**
     * 2.提供创建接口
     */
    public static HungerSingleton getInstance(){
        //如果是空就创建
        if (instance == null){
            //不能直接return 而是需要赋值
            instance = new HungerSingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        /**
         * 对象的hahcode一致，说明是一个对象
         */
        System.out.println(HungerSingleton.getInstance().hashCode());
        System.out.println(HungerSingleton.getInstance().hashCode());
    }
}

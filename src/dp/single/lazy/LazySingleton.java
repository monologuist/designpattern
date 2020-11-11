package dp.single.lazy;

/**
 * 单例模式实现1：懒汉式
 */
public class LazySingleton {
    //初始化空
    private static LazySingleton instance = null;

    /**
     * 1.构造函数私有化
     */
    private LazySingleton(){

    }

    /**
     * 2.提供创建接口
     */
    public static LazySingleton getInstance(){
        //如果是空就创建
        if (instance == null){
            //不能直接return 而是需要赋值
            instance = new LazySingleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        /**
         * 对象的hahcode一致，说明是一个对象
         */
        System.out.println(LazySingleton.getInstance().hashCode());
        System.out.println(LazySingleton.getInstance().hashCode());
    }
}

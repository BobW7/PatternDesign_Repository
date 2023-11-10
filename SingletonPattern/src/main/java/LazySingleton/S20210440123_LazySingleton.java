package LazySingleton;

@SuppressWarnings("InstantiationOfUtilityClass")
public class S20210440123_LazySingleton {
    private volatile static S20210440123_LazySingleton instance;

    private S20210440123_LazySingleton() {
        // 私有构造函数，防止外部实例化
    }

    public static S20210440123_LazySingleton getInstance() {
        if (instance == null) {
            synchronized (S20210440123_LazySingleton.class) {
                if (instance == null) {
                    instance = new S20210440123_LazySingleton();
                }
            }
        }
        return instance;
    }
}
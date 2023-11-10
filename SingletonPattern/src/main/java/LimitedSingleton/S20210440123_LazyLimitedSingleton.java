package LimitedSingleton;

public class S20210440123_LazyLimitedSingleton {
    private static final int MAX_INSTANCES = 5; // 最大实例数量
    private static int instanceCount = 0; // 当前实例数量
    private static volatile S20210440123_LazyLimitedSingleton[] instances
            = new S20210440123_LazyLimitedSingleton[MAX_INSTANCES];

    private S20210440123_LazyLimitedSingleton() {
        // 私有构造函数，防止外部实例化
    }

    public static S20210440123_LazyLimitedSingleton getInstance() {
        if (instanceCount < MAX_INSTANCES) {
            if (instances[instanceCount] == null) {
                synchronized (S20210440123_LazyLimitedSingleton.class) {
                    if (instances[instanceCount] == null) {
                        instances[instanceCount] = new S20210440123_LazyLimitedSingleton();
                    }
                }
            }
            return instances[instanceCount++];
        } else {
            throw new IllegalStateException("Reach the maximum number of instances.");
        }
    }
}
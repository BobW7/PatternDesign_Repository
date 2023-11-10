package LimitedSingleton;

public class S20210440123_HungryLimitedSingleton {
    private static final int MAX_INSTANCES = 5; // 最大实例数量
    private static int instanceCount = 0; // 当前实例数量

    private S20210440123_HungryLimitedSingleton() {
        // 私有构造函数，防止外部实例化
    }

    private static class S20210440123_HungryLimitedSingletonHolder {
        private static final S20210440123_HungryLimitedSingleton[] INSTANCES
                = new S20210440123_HungryLimitedSingleton[MAX_INSTANCES];
    }

    public static S20210440123_HungryLimitedSingleton getInstance() {
        if (instanceCount < MAX_INSTANCES) {
            return S20210440123_HungryLimitedSingletonHolder.INSTANCES[instanceCount++];
        } else {
            throw new IllegalStateException("Reach the maximum number of instances.");
        }
    }
}
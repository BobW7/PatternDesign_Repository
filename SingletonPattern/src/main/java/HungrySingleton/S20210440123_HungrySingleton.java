package HungrySingleton;

@SuppressWarnings("InstantiationOfUtilityClass")
public class S20210440123_HungrySingleton {
    //静态内部类
    private static class S20210440123_SingletonHolder{
        private static final S20210440123_HungrySingleton INSTANCE = new S20210440123_HungrySingleton();
    }
    //私有方法防止外部调用创建对象
    private S20210440123_HungrySingleton(){}
    //外部类获得单例对象方法
    public static S20210440123_HungrySingleton getInstance(){
        return S20210440123_SingletonHolder.INSTANCE;
    }
}

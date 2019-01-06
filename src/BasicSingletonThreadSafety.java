public class BasicSingletonThreadSafety {
    private static BasicSingletonThreadSafety instance;

    private BasicSingletonThreadSafety() {

    }

    public static BasicSingletonThreadSafety getInstance() {
        if (instance == null) {
            synchronized (BasicSingletonThreadSafety.class) {
                if (instance == null) {
                    instance = new BasicSingletonThreadSafety();
                }
            }

        }
        return instance;
    }
}

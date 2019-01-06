public class BasicSingletonV2 {
    private static BasicSingletonV2 instance;

    private BasicSingletonV2() {

    }

    public static BasicSingletonV2 getInstance() {
        if(instance == null) {
            instance = new BasicSingletonV2();
        }
        return instance;
    }
}

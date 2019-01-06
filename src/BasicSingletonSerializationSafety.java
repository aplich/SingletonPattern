import java.io.Serializable;

public class BasicSingletonSerializationSafety implements Serializable {
    private static BasicSingletonSerializationSafety instance = new BasicSingletonSerializationSafety();
    private static final long serialVersionUID = 11111;

    private BasicSingletonSerializationSafety() {

    }

    public static BasicSingletonSerializationSafety getInstance() {
        return instance;
    }

    protected Object readResolve() {
        return getInstance();
    }
}

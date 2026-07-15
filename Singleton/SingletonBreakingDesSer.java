import java.io.Serializable;

public class SingletonBreakingDesSer implements Serializable {
    private static SingletonBreakingDesSer singletonBreakingDesSer;

    private SingletonBreakingDesSer() {

    }

    public static SingletonBreakingDesSer getInstance() {
        if (singletonBreakingDesSer == null) {
            synchronized (SingletonBreakingDesSer.class) {
                if (singletonBreakingDesSer == null) {
                    singletonBreakingDesSer = new SingletonBreakingDesSer();
                }
            }
        }
        return singletonBreakingDesSer;
    }

    // Ensures the same instance is returned during deserialization
    protected Object readResolve() {
        return getInstance();
    }
}

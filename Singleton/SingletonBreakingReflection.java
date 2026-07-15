public class SingletonBreakingReflection {
    private static SingletonBreakingReflection singletonBreakingReflection;

    private SingletonBreakingReflection() {
        if (singletonBreakingReflection != null) {
            // if an instance already exists, throw an exception
            // This is intended to stop reflection from creating a second instance
            throw new RuntimeException("You are violating Singleton Pattern!!");
        }
    }

    public static SingletonBreakingReflection getInstance() {
        if (singletonBreakingReflection == null) {
            synchronized (SingletonBreakingReflection.class) {
                if (singletonBreakingReflection == null) {
                    singletonBreakingReflection = new SingletonBreakingReflection();
                }
            }
        }
        return singletonBreakingReflection;
    }
}

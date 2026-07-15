public class SingletonBreakingClone implements Cloneable {
    private static SingletonBreakingClone singletonBreakingClone;

    private SingletonBreakingClone() {
    }

    public static SingletonBreakingClone getInstance() {
        if (singletonBreakingClone == null) {
            synchronized (SingletonBreakingClone.class) {
                if (singletonBreakingClone == null) {
                    singletonBreakingClone = new SingletonBreakingClone();
                }
            }
        }
        return singletonBreakingClone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // return super.clone(); // breaks Singleton Pattern
            // Option 1: Prevent cloning completely
        throw new CloneNotSupportedException("Clonning of Singleton instance not possible!!");

        // or you can also return same object getInstance();
    }
}

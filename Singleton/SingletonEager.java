class SingletonEager {
    private static SingletonEager singletonEager = new SingletonEager();
    private SingletonEager() {

    }
    public static SingletonEager getInstance() {
        return singletonEager;
    }
}

/**
 * SingletonEager demonstrates eager initialization of the Singleton pattern.
 * 
 * Key points:
 * - The instance is created at the time of class loading.
 * - The constructor is private, preventing external instantiation.
 * - The getInstance() method always returns the same pre‑created instance.
 * 
 * Pros:
 * - Simple and thread‑safe (class loading ensures only one instance).
 * 
 * Cons:
 * - Instance is created even if it is never used, which may waste resources.
 */
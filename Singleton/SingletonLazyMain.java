public class SingletonLazyMain {
    public static void main(String[] args) {
        // Direct instantiation is not allowed because the constructor is private.
        // This ensures that objects of SingletonLazy cannot be created externally.
        // SingletonLazy singletonLazy = new SingletonLazy();  // ❌ Compilation error

        // Access the singleton instance using the getInstance() method.
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();
        System.out.println("HashCode of instance 1: " + singletonLazy1.hashCode());

        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println("HashCode of instance 2: " + singletonLazy2.hashCode());

        // Both hashcodes should be identical, proving that only one instance exists.
    }
}

/*
 * This example demonstrates lazy initialization in the Singleton pattern.
 * Lazy initialization means the instance is created only when it is first requested.
 *
 * ⚠️ Limitation:
 * The current implementation is not thread-safe. In a concurrent environment,
 * multiple threads may simultaneously access the getInstance() method,
 * potentially creating multiple instances.
 *
 * ✅ Solution:
 * To make it thread-safe, we can use synchronization (e.g., synchronized method or block),
 * or apply double-checked locking with the 'volatile' keyword.
 */

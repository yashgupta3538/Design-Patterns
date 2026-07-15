import java.lang.reflect.Constructor;

public class SingletonBreakingReflectionMain {
    public static void main(String[] args) throws Exception {

        SingletonBreakingReflection singletonBreakingReflection1 = SingletonBreakingReflection.getInstance();
        System.out.println("Hashcode of 1st instance: " + singletonBreakingReflection1.hashCode());

        // Use reflection to access the private constructor
        Constructor<SingletonBreakingReflection> constructor = SingletonBreakingReflection.class
                .getDeclaredConstructor();
        constructor.setAccessible(true); // Bypass private access
        SingletonBreakingReflection singletonBreakingReflection2 = constructor.newInstance(); // Create a new instance
                                                                                              // via reflection
        System.out.println("Hashcode of 2nd instance: " + singletonBreakingReflection2.hashCode());

    }
}

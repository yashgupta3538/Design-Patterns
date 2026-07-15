public class SingletonEagerMain {
    public static void main(String[] args) {
        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println(singletonEager1.hashCode());
        
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager2.hashCode());
    }
}

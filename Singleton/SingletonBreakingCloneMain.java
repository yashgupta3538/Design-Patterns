public class SingletonBreakingCloneMain {
    public static void main(String[] args) throws Exception {
        SingletonBreakingClone singletonBreakingClone1 = SingletonBreakingClone.getInstance();
        // Break singleton via cloning
        SingletonBreakingClone singletonBreakingClone2 = (SingletonBreakingClone) singletonBreakingClone1.clone();
        System.out.println(singletonBreakingClone1.hashCode());
        System.out.println(singletonBreakingClone2.hashCode());
    }
}

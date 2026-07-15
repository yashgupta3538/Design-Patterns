class SingletonLazy {
    private static SingletonLazy singletonLazy;
    private SingletonLazy () {

    }
    public static SingletonLazy getInstance() {
        if (singletonLazy == null) {
            synchronized(SingletonLazy.class) { //Make lazy initialization thread safe
                if (singletonLazy == null) {
                    singletonLazy = new SingletonLazy();
                }
            }
        }
        return singletonLazy;
    }
}
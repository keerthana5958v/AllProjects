public class SingletonExample {
    static SingletonExample instance;
    public SingletonExample() {
    }
    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
    public void mySingletonMethod() {
        System.out.println("Singleton instance has started running");
    }
    public static void main(String[] args) {
        // Get the Singleton instance
        SingletonExample obj1 = SingletonExample.getInstance();
        SingletonExample obj2 = SingletonExample.getInstance();
        obj1.mySingletonMethod();
//        obj2.mySingletonMethod();

    }
}
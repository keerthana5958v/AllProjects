public class Main {
    public static void main(String[] args) {


        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        s2=null;
        s1=null;
        s3 = null;
        System.gc();

    }
    public void finalize(){ // deprecated method
        System.out.println("garbage is collected");
    }
}

//thread dump

// runtime class or process builder class
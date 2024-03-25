import java.util.ArrayList;

public class Main implements A{
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(46);
        num.add(56);
        for (Integer i : num) {
//            System.out.println(((Object)i).getClass());
            System.out.println(i);
//            if (i == 56) {
//                num.remove(i);
//            }

        }

    }
//    void rn(){
//        System.out.println("run");
//    }
    void go(){
        System.out.println("go");
    }

    @Override
    public void rn() {

    }
}


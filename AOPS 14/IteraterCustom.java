import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteraterCustom implements Iterator {
    int currentIdx;
    List<String> list;
   // ArrayList

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
    IteraterCustom(){
    }

    public static void main(String[] args) {
//        System.out.printf("%10s", 10.0);
        int x = 5;

        System.out.println(x++);
    }
}



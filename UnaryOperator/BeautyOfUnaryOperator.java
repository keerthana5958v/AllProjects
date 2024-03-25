public class BeautyOfUnaryOperator {

    public static void main(String[] args) {
        BeautyOfUnaryOperator obj = new BeautyOfUnaryOperator();
        obj.UnaryOperator();
    }
    public void UnaryOperator(){
        int i = 4;
        i++;
        System.out.println("i= "+i);
        int k = 4;
        ++k;
        System.out.println("k= "+k);
        int a=1;
        int b=++i;
        System.out.println("a is "+a + ", b is "+b);
        int c=1;
        int d=++i;
        System.out.println("c is "+c + ", d is "+d);

        int w = 1;
        int x = i++ + 4;
        System.out.println("w is "+w+ ",x is "+x);
        int y = 1;
        int z = i++ + 4;
        System.out.println("y is "+y+ ",z is "+z);
    }
}
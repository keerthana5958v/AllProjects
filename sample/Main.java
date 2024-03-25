public class Main{
    int a=3;
    int d =2;
    public void additionOperation(){

        System.out.println(a+ " "+(a+d)+" "+ (a+(2*d)));
    }
    public void subrationOperation(){
        System.out.println("geometric series-->"+a + " "+ a*d +" "+ a*(d*d));
    }

    public static  void main(String[]args){
        Main obj = new Main();
        obj.additionOperation();
        obj.subrationOperation();
    }
}
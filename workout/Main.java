public class Main {
    int id= 0;
    static int counter=0;
    public void create(){
        id++;
        counter++;
        System.out.println("id is ="+id+"counter"+counter);
    }
    public static void main(String[] args) {
        Main s1= new Main();
        s1.create();
        Main s2= new Main();
        s2.create();
        Main s3= new Main();
        s3.create();
    }
}
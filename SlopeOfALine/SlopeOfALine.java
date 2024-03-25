import java.util.Scanner;
class SlopeOfALine{
    static float m;
    static float x;
    static float c;
    float y;
    public SlopeOfALine(){
    }
    public SlopeOfALine(float m, float x, float c){
        this.m = m;
        this.x = x;
        this.c = c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m : ");
        m = sc.nextInt();
        System.out.print("Enter the value of x : ");
        x = sc.nextInt();
        System.out.print("Enter the value of c : ");
        c = sc.nextInt();
        SlopeOfALine obj = new SlopeOfALine(m,x,c);
        SlopeOfALine.findSlope(obj);
    }
    public float getM(){
        return m;
    }
    public void setM(float m){
        this.m = m;
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x = x;
    }
    public float getC(){
        return c;
    }
    public void setC(float C){
        this.c = c;
    }
    public static void findSlope(SlopeOfALine y){
        float slope = (m*x)+c;
        System.out.println("slope: "+slope);
    }
}
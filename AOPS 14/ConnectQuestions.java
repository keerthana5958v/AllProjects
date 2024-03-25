public class ConnectQuestions {
    int num;
    public void ConnectQuestions(){
        System.out.println("printing Java constructor");
    }
    public ConnectQuestions(int num){
        this.num = num;
    }
    public ConnectQuestions(Integer num){
        if(num == null){
            this.num = 0;
        }
        else {
            this.num = num;
        }
    }
    public ConnectQuestions(String num){
        this.num = Integer.parseInt(num);
    }
    public void disp(){
        System.out.println(this.num);
    }

    public static void main(String[] args) {
        Integer i1 = null;
        ConnectQuestions jc = new ConnectQuestions(i1);
        jc.disp();
    }

}




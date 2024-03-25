public class StackWorkout {
    int capacity = 10;
    int top = 0;
    public void push(){
        if(top<capacity){
            ++top;
            System.out.println(top);
        }
        else {
            System.out.println("capacity reached");
        }
    }
    public void pop(){
        if(top<=0){
            System.out.println("stack is empty");
        }
        else{
            --top;
            System.out.println(top);
        }
    }

    public static void main(String[] args) {
        StackWorkout obj = new StackWorkout();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.push();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();

    }
}

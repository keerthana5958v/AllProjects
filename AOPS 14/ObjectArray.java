import java.util.Arrays;

public class ObjectArray {
    public static void main(String[] args) {
        ObjectArray obj = new ObjectArray();
        System.out.println(Arrays.toString(obj.createObjArray()));
    }
//    public String toString(){
//        String temp = "[ ";
//        for(int i = 0 ; i < createObjArray().length ; i++){
//            if(i != createObjArray().length - 1){
//                temp += createObjArray()[i] + " , ";
//            }
//            else{
//                temp += createObjArray()[i];
//            }
//        }
//        temp += " ]";
//        return  temp;
//    }
    Object[] createObjArray(){
        Object[] arr = new Object[3];
        arr[0] = Integer.valueOf(5);
        arr[1] = new String("hello");
        arr[2] = Float.valueOf(0.5f);
        return arr;
    }
}

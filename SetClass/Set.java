public class Set {
    //declaring instance variables
    private int[] set;

    //constructors
    public Set(){
        this.set = new int[]{1,2,3,4};
    }
    public Set(int[] set){
        this.set = set;
    }

    //main method
    public static void main(String[] args) {
        Set setA = new Set();
        Set setB = new Set(new int[]{1,3,6,2,7});
        System.out.println("set A: "+setA);
        System.out.println("set B: "+setB);
        System.out.println("Union: "+setA.setUnion(setB));
    }

    //methods
    public boolean isExist(int set[] , int value){
        boolean isPresent = false;
        for(int i = 0 ; i < set.length ; i++){
            if(set[i] == value){
                isPresent = true;
            }
        }
        return isPresent;
    }
    public int lengthOfSet(){
        return this.set.length;
    }
    public Set setUnion(Set obj){
        int[] arr = new int[this.lengthOfSet() + obj.lengthOfSet()];
        for(int i = 0 ; i<this.lengthOfSet() ; i++){
            arr[i] = this.set[i];
        }
        int counter = this.set.length;
        for(int i = 0 ; i< obj.set.length; i++){
            if(!isExist(arr, obj.set[i])){
                arr[counter] = obj.set[i];
                counter++;
            }
        }
        return new Set(removeZeros(arr));
    }
    public String toString(){
        String temp = "";
        if (set!=null || set.length > 0){
            temp = "[";
            for (int i = 0 ; i < set.length ; i++){
                if(i != set.length - 1){
                    temp += set[i] + " , ";
                }
                else{
                    temp += set[i] + "]";
                }
            }
        }
        return  temp;
    }
    public int[] removeZeros(int[] arr){
        int val=0;
        for (int i = 0 ; i< arr.length ; i++) {
            if(arr[i]!=0){
                val++;
            }
        }
        int[] temp = new int[val];
        int counter = 0;
        for (int i = 0 ; i< arr.length ; i++){
            if(arr[i] != 0){
                temp[counter] = arr[i];
                counter++;
            }
        }
        return temp;
    }
}
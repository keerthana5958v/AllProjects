import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        ArrayList[] wrapper = new ArrayList[a];
        for(int i = 0 ; i < a ; i++){
            ArrayList<Integer>  miniList = new ArrayList<>();
            Integer count = Integer.parseInt(s.next());
            while(count>0){
                Integer element = Integer.parseInt(s.next());
                miniList.add(element);
                count--;
            }
            wrapper[i] = miniList;
        }
        int b = s.nextInt();
        for(int i = 0 ; i < b ; i++){
            String s1 = s.next();
            int arrayIdx = Integer.parseInt(s1);
            String s2 = s.next();
            int elementIdx = Integer.parseInt(s2);
            if(arrayIdx > a){
                System.out.println("ERROR!");
            }
            else if(wrapper[arrayIdx-1].size() < elementIdx ){
                System.out.println("ERROR!");
            }
            else{
                System.out.println(wrapper[arrayIdx-1].get(elementIdx-1));
            }
        }
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s= new Scanner(System.in);
        int size = s.nextInt();
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 0 ; i < size; i++){
            list.add(Integer.parseInt(s.next()));
        }
        int numberOfQueries = s.nextInt();
        while(numberOfQueries>0){
            String operation = s.next();
            if(operation.equals("Insert")){
                int x = Integer.parseInt(s.next());
                int y = Integer.parseInt(s.next());
                list.add(x,y);
            }
            else{
                int idx = Integer.parseInt(s.next());
                if (idx >= 0 && idx < list.size()) {
                    list.remove(idx);
                }
            }
            numberOfQueries--;
        }
        s.close();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" "); 
        }
        
        
        
    }
}

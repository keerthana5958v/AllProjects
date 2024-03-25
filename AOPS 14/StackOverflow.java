//import java.nio.file.StandardWatchEventKinds;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//
//class StackOverFlow {
//    public static void main(String[] args) {
////        LinkedList<Integer> ll = new LinkedList<>();
////        ll.add(3);
////        ll.add(4);
////        ll.add(5);
////        System.out.println(ll);
////        ll.add(2,6);
////        System.out.println(ll);
//        StackOverFlow a = new StackOverFlow();
//        System.out.println(a);
////        CopyOnWriteArrayList<Object> cowar= new CopyOnWriteArrayList<>();
//    }
//    static int n = 5;
//    public StackOverFlow(){
//        while(n<10) {
//            new StackOverFlow();
//            n++;
//        }
//        System.out.println("obj created");
//    }
//}

//package sortingalgos;

import java.util.ArrayList;
import java.util.List;

class QuickSort{
    List<Integer> elements;

    public QuickSort(){
        this.elements = new ArrayList<Integer>();
        this.elements.add(10);
        this.elements.add(9);
        this.elements.add(8);
        this.elements.add(7);
        this.elements.add(6);
        this.elements.add(5);
        this.elements.add(4);
        this.elements.add(3);
        this.elements.add(2);
        this.elements.add(1);
    }
    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        qs.quickSortWrapper(qs.elements, 0, qs.elements.size()-1);
        qs.display();
    }

    public int quickSort(List<Integer> elems, int start, int end){
        int pivotElemnt = elems.get(end);
        int pivotPosition = start;
        int count = 0;

        for(int j=start; j<end; j++){
            count++;
            if(elems.get(j) <= pivotElemnt) {
                int temp = elems.get(j);
                elems.set(j, elems.get(pivotPosition));
                elems.set(pivotPosition, temp);
                pivotPosition = pivotPosition + 1;
            }
        }
        int temp1 = elems.get(pivotPosition);
        elems.set(pivotPosition, elems.get(end));
        elems.set(end, temp1);
        return pivotPosition;
    }

    public void quickSortWrapper(List<Integer> elems, int start, int end) {
        if (start < end){
            int pivotPosition = quickSort(elems, start, end);
            quickSortWrapper(elems, start, pivotPosition-1);
            quickSortWrapper(elems, pivotPosition+1, end);
        }
    }

    public void display() {
        for(int i=0; i<elements.size(); i++){
            System.out.println(elements.get(i));
        }
    }
}

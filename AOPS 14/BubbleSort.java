import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    List<Integer> elements;
    public BubbleSort(){
        this.elements = new ArrayList<Integer>();
        this.elements.add(4);
        this.elements.add(7);

        this.elements.add(8);
        this.elements.add(6);
        this.elements.add(5);
        this.elements.add(3);
        this.elements.add(2);
        this.elements.add(9);

        this.elements.add(1);
        this.elements.add(10);

    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort();
        bs.display();
    }

    public void bubbleSort() {
        int count = 0;
        for(int i=0;i<this.elements.size(); i++) {
            for(int j=0;j<this.elements.size()-i-1; j++){
                if(elements.get(j) > elements.get(j+1)){
                    int temp = elements.get(j);
                    elements.set(j, elements.get(j+1));
                    elements.set(j+1, temp);
                }
                count++;
            }
        }
        System.out.println(count);
    }

    public void display() {
        for(int i=0;i<this.elements.size(); i++) {
            System.out.println(this.elements.get(i));
        }
    }
}
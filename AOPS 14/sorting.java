import java.util.List;

import java.util.ArrayList;



class SelectionSort {
    private List<Integer> elements;

    public SelectionSort(){
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
        SelectionSort ss = new SelectionSort();
        ss.selectionSort();
        ss.display();
    }
    public void selectionSort() {
        int count = 0;
        for(int i=0;i<this.elements.size(); i++) {
            for(int j=i+1; j<this.elements.size(); j++) {
                if(this.elements.get(i) > this.elements.get(j)) {
                    int temp = this.elements.get(i);
                    this.elements.set(i, this.elements.get(j));
                    this.elements.set(j, temp);
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public void display() {
        for(int i=0;i<this.elements.size(); i++){
            System.out.println(this.elements.get(i));
        }
    }
}
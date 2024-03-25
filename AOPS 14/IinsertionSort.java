import java.util.List;

import java.util.ArrayList;

class InsertionSort {

    List<Integer> elements;

    public InsertionSort() {
        this.elements = new ArrayList<>();
//        this.elements.add(6);
//        this.elements.add(7);
//        this.elements.add(3);
//        this.elements.add(10);
//        this.elements.add(1);
//
//        this.elements.add(5);
//        this.elements.add(4);
//        this.elements.add(9);
//        this.elements.add(8);
//        this.elements.add(2);
        this.elements.add(1);
        this.elements.add(2);
        this.elements.add(3);
        this.elements.add(4);
        this.elements.add(5);
        this.elements.add(6);
        this.elements.add(7);
        this.elements.add(8);
        this.elements.add(9);
        this.elements.add(10);


    }
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        is.insertionSort();
        is.display();
    }
    int count = 0;

    public void insertionSort()
    {
        for(int i=1; i<this.elements.size(); i++){
            int key = this.elements.get(i);
            int j= i-1;
            while (j>=0 && key < this.elements.get(j)) {
                this.elements.set(j+1, elements.get(j));
                j = j-1;

            }
            count++;
            this.elements.set(j+1, key);
        }

    }

    public void display() {
        for(int i=0; i<this.elements.size(); i++) {
            System.out.println(this.elements.get(i));
        }
        System.out.println(count);
    }
}
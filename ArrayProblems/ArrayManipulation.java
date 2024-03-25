import java.util.Arrays;
public class ArrayManipulation {
    public int[] number;
    public ArrayManipulation(int[] number) {
        this.number = number;
    }
    public static void main(String[] args) {
        ArrayManipulation obj = new ArrayManipulation(new int[] { 4,23,65,2,8,1,8,32 });
        System.out.println("Given Array: " + obj);
        ArrayManipulation newArrayAfterAdd = obj.addElement(4);
        System.out.println("Adding element in array " + newArrayAfterAdd);
        ArrayManipulation newArrayAfterRemove = obj.removeElement(1);
        System.out.println("removing element in array: " + newArrayAfterRemove);
        ArrayManipulation newArrayAfterModify = obj.modifyElement(3, 6);
        System.out.println("modifying element: " + newArrayAfterModify);
    }
    public String toString() {
        String res = "";
        if (number != null && number.length > 0) {
            res = ("[");
            for (int i = 0; i < number.length; i++) {
                if (i != number.length - 1) {
                    res = res + number[i] + ", ";
                } else {
                    res = res+number[i] + "]";
                }
            }
        } else {
            res="[]";
        }
        return res;
    }
    public ArrayManipulation addElement(int element) {
        int[] newArray = new int[number.length + 1];
        for (int i = 0; i < number.length; i++) {
            newArray[i] = number[i];
        }
        newArray[number.length] = element;
        return new ArrayManipulation(newArray);
    }

    public ArrayManipulation removeElement(int index) {
        if (index < 0 && index >= number.length) {
            return new ArrayManipulation(number);
        }
        int[] newArray = new int[number.length - 1];
        for (int i = 0, newIndex = 0; i < number.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[newIndex++] = number[i];
        }
        return new ArrayManipulation(newArray);
    }

    public ArrayManipulation modifyElement(int index, int newValue) {
        if (index < 0 || index >= number.length) {
            return new ArrayManipulation(number);
        }
        int[] newArray = Arrays.copyOf(number, number.length);
        newArray[index] = newValue;
        return new ArrayManipulation(newArray);
    }

}
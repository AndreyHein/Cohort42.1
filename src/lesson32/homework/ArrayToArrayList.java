package lesson32.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList<A> {
    private A array[];
    private List<A> arrList;

    public ArrayToArrayList(A[] array) {
        this.array = array;
    }

    public boolean changeElements(A val1, A val2) {
        int idx1 = -1, idx2 = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(val1)) {
                idx1 = i;
            } else if (array[i].equals(val2)) {
                idx2 = i;
            }
        }
        if (idx1 != -1 && idx2 != -1) {
            A temp = array[idx1];
            array[idx1] = array[idx2];
            array[idx2] = temp;
            return true;
        } else {
            return false;
        }
    }

    public List<A> toArrayList(A[] array) {
        arrList = new ArrayList<>();
        for (A arr : array) {
            arrList.add(arr);
        }
        return arrList;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

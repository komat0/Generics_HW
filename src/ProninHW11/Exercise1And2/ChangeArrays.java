package ProninHW11.Exercise1And2;

import java.util.ArrayList;
import java.util.Collections;

public class ChangeArrays {

    public static <T> void changeArrayInd(T[] array, int from, int to) {
        T buffer = array[from];
        array[from] = array[to];
        array[to] = buffer;
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] array) {
        ArrayList<T> list = new ArrayList<T>();
        Collections.addAll(list, array);
        System.out.println(list);
        return list;
    }
}

public class ChangeArrayIndex {

    public static <E> void changeArrayInd(E[] array, int from, int to ) {
        Object buffer = array[from];
        array[from] = array[to];
        array[to] = (E) buffer;
    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] exercise1 = {"1", "2", "3", "4", "5"};
        Double[] exercise11 = {1.0, 2.2, 3.3, 4.4, 5.5};

        System.out.println(Arrays.toString(exercise1));
        ChangeArrays.changeArrayInd(exercise1, 1, 4);
        System.out.println(Arrays.toString(exercise1));

        System.out.println("+++++");

        System.out.println(Arrays.toString(exercise11));
        ChangeArrays.changeArrayInd(exercise11, 1, 4);
        System.out.println(Arrays.toString(exercise11));

        System.out.println("+++++");

        ChangeArrays.arrayToArrayList(exercise1);
        System.out.println(ChangeArrays.arrayToArrayList(exercise1));
    }
}
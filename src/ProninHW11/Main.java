package ProninHW11;

import ProninHW11.Exercise.Apple;
import ProninHW11.Exercise.Box;
import ProninHW11.Exercise.Orange;

public class Main {
    public static void main(String[] args) {

/*        String[] exercise1 = {"1", "2", "3", "4", "5"};
        Double[] exercise11 = {1.0, 2.2, 3.3, 4.4, 5.5};

        System.out.println(Arrays.toString(exercise1));
        ProninHW11.Exercise1And2.ChangeArrays.changeArrayInd(exercise1, 1, 4);
        System.out.println(Arrays.toString(exercise1));

        System.out.println("+++++");

        System.out.println(Arrays.toString(exercise11));
        ProninHW11.Exercise1And2.ChangeArrays.changeArrayInd(exercise11, 1, 4);
        System.out.println(Arrays.toString(exercise11));

        System.out.println("+++++");

        ProninHW11.Exercise1And2.ChangeArrays.arrayToArrayList(exercise1);
        System.out.println(ProninHW11.Exercise1And2.ChangeArrays.arrayToArrayList(exercise1));
        */

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> boxOfApples = new Box<Apple>();
        Box<Orange> boxOfOranges = new Box<Orange>();

        boxOfApples.boxAddFruit(apple1);
        boxOfApples.boxAddFruit(apple2);
        boxOfApples.boxAddFruit(apple3);

        boxOfApples.getWeight();
    }
}
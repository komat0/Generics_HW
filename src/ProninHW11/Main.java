package ProninHW11;

import ProninHW11.Exercise.Apple;
import ProninHW11.Exercise.Box;
import ProninHW11.Exercise.Orange;
import ProninHW11.Exercise1And2.ChangeArrays;

import java.util.Arrays;

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

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxOfApples = new Box<>();
        Box<Apple> boxOfApples2 = new Box<>();
        Box<Orange> boxOfOranges = new Box<>();
        Box<Orange> boxOfOranges2 = new Box<>();


        boxOfApples.boxAddFruit(apple);
        boxOfApples.boxAddFruit(apple);
        boxOfApples.boxAddFruit(apple);
        boxOfOranges.boxAddFruit(orange);
        boxOfOranges.boxAddFruit(orange);
        boxOfOranges.boxAddFruit(orange);
        boxOfApples2.boxAddFruit(apple);
        boxOfApples2.boxAddFruit(apple);
        boxOfApples2.boxAddFruit(apple);

        System.out.println("+++++");

        System.out.println(boxOfApples.getWeight());
        System.out.println(boxOfApples2.getWeight());
        System.out.println(boxOfOranges.getWeight());
        System.out.println(boxOfOranges2.getWeight());

        System.out.println("+++++");

        boxOfApples.compare(boxOfOranges);
        boxOfApples.compare(boxOfApples2);

        System.out.println("+++++");

        System.out.println(boxOfApples.getWeight());
        System.out.println(boxOfApples2.getWeight());

        System.out.println("+++++");

        boxOfApples.transferTo(boxOfApples2);
        System.out.println(boxOfApples.getWeight() + ": Вес ящика 1");
        System.out.println(boxOfApples2.getWeight() + ": Вес ящика 2");

        System.out.println("+++++");

        System.out.println(boxOfOranges.getWeight());
        System.out.println(boxOfOranges2.getWeight());

        System.out.println("+++++");

        boxOfOranges.transferTo(boxOfOranges2);
        System.out.println(boxOfOranges.getWeight());
        System.out.println(boxOfOranges2.getWeight());

        System.out.println("+++++");
        boxOfOranges.compare(boxOfApples);

    }
}
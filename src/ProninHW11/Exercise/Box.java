package ProninHW11.Exercise;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> listOfFruits = new ArrayList<T>();

    public Box() {
    }

    public void boxAddFruit(T fruit) {
        listOfFruits.add(fruit);
    }

    //высчитывает вес коробки, зная вес одного фрукта и их количество
    public double getWeight() {
        double size = listOfFruits.size();
        double fruitWeight = listOfFruits.get(0).getWeight() * size;
        System.out.println(fruitWeight);
        return fruitWeight;
    }

    public ArrayList<T> getListOfFruits() {
        return listOfFruits;
    }

    //позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
    //равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
//    public boolean compare(ProninHW11.Exercise.Box<T> box1, ProninHW11.Exercise.Box<T> box2) {
//        if (box1.getWeight().equals(box2.getWeight()) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}


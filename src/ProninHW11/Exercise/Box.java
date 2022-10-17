package ProninHW11.Exercise;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private final ArrayList<T> listOfFruits = new ArrayList<>();

    public Box() {
    }

    public void boxAddFruit(T fruit) {
        listOfFruits.add(fruit);
    }

    //высчитывает вес коробки, зная вес одного фрукта и их количество
    public double getWeight() {
        double size = listOfFruits.size();
        if (size == 0) {
            return 0.0;
        } else {
            return listOfFruits.get(0).getWeight() * size;
        }
    }

    //позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы
    //равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    public boolean compare(Box<? extends Fruit> box) {
        double weight = this.getWeight();
        if (weight == box.getWeight()) {
            System.out.println("The Boxes are same");
            return true;
        } else {
            System.out.println("The Boxes are NOT the same");
            return false;
        }
    }

    /*
     * Метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты,
     * которые были в первой; g. Не забываем про метод добавления фрукта в коробку.
     */
    public void transferTo(Box<T> box) {
        box.listOfFruits.addAll(listOfFruits);
        listOfFruits.clear();
    }
}


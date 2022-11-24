package com.geekbrains.lesson4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> fruitBox = new ArrayList<>();

    public float getWeight() {
        float fullWeightFruit = 0.0f;
        for (Fruit fruit : fruitBox) {
            fullWeightFruit = +fullWeightFruit + fruit.weight;
        }
        return fullWeightFruit;
    }

    public boolean compareBoxFruitByWeight(Box boxFruit) {
        return ((this.getWeight() - boxFruit.getWeight()) < 0.00001);
    }

    public void pourTo(Box<T> box) {
        box.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }

    public void addFruitInBox(T fruit) {
        fruitBox.add(fruit);
    }

}

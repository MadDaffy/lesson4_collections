package com.geekbrains.lesson4;

import java.util.ArrayList;
import java.util.Arrays;

//        1. Написать метод, который меняет два элемента массива местами (массив может быть любого
//        ссылочного типа).
//        2. Написать метод, который преобразует массив в ArrayList.
//        3. Задача:
//        a. Даны классы Fruit -> Apple, Orange.
//        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу
//        фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины.
//        c. Для хранения фруктов внутри коробки можно использовать ArrayList.
//        d. Написать метод getWeight(), который высчитывает вес коробки. Задать вес одного
//        фрукта и их количество: вес яблока — 1.0f, апельсина — 1.5f (единицы измерения не
//        важны).
//        e. Внутри класса Box написать метод Compare, который позволяет сравнить текущую
//        коробку с той, которую подадут в Compare в качестве параметра. True, если их массы
//        равны, False — в противном случае. Можно сравнивать коробки с яблоками и
//        апельсинами.
//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//        Помним про сортировку фруктов: нельзя высыпать яблоки в коробку с апельсинами.
//        Соответственно, в текущей коробке фруктов не остаётся, а в другую перекидываются
//        объекты, которые были в первой.
//        g. Не забываем про метод добавления фрукта в коробку.

public class MainApp {
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox1.addFruitInBox(new Apple(0.5f));
        appleBox1.addFruitInBox(new Apple(0.3f));
        appleBox2.addFruitInBox(new Apple(0.2f));

        orangeBox1.addFruitInBox(new Orange(0.3f));
        orangeBox1.addFruitInBox(new Orange(0.5f));
        orangeBox2.addFruitInBox(new Orange(0.2f));

        appleBox2.pourTo(appleBox1);
        orangeBox2.pourTo(orangeBox1);

        System.out.println("appleBox1: " + appleBox1.getWeight());
        System.out.println("appleBox2: " + appleBox2.getWeight());
        System.out.println("appleBox1: " + orangeBox1.getWeight());
        System.out.println("appleBox2: " + orangeBox2.getWeight());
        System.out.println("Коробки равны и это: " + appleBox1.compareBoxFruitByWeight(orangeBox1));

    }

    public static void switchElemInArray(Object[] array, int indexFirstElem, int indexSecondElem) {
        Object buffer = array[indexFirstElem];
        array[indexFirstElem] = array[indexSecondElem];
        array[indexSecondElem] = buffer;
    }

    public static <T> ArrayList<T> arrayToArrayList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }
}

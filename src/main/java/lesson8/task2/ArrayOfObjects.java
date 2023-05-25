package lesson8.task2;

import java.util.Arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        System.out.println(Arrays.toString(cats));

        Cat cat = new Cat(7, "Black");
        cats[2] = cat;

        System.out.println(cats[2].getColor());

        Cat[] cats1 = {new Cat(2, "White"), new Cat(4, "Gray"), cat};

        System.out.println("Возраст всех котов в массиве:");
        for (Cat currentCat : cats1) {
            System.out.println(currentCat.getAge());
        }

        System.out.println(cats1[cats1.length - 1].getColor());
    }
}

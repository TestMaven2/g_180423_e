package lesson11.task7;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    // Метод, который позволяет покормить кота.
    // Метод должен принимать целочисленное количество еды.
    // Метод должен вернуть true, если кот наелся, то есть
    // количество еды было 10 или более.
    public boolean feedCat(int food) {
        return food >= 10;
    }
}
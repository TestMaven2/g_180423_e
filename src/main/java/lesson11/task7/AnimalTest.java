package lesson11.task7;

public class AnimalTest {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.voice();
        cat.voice();

        // Анонимный класс
        Animal someAnimal = new Animal() {
            @Override
            public void voice() {
                System.out.println("Grrrrr!");
            }
        };

        someAnimal.voice();

        // Анонимный объект
        // Служит для немедленного однократного вызова метода
        // Будет уничтожен после вызова метода
        new Dog().voice();
    }
}
package lesson11.task4;

public class Cat {

    public void voice() {
        System.out.println("Meow!");
    }

    public static void printInfo() {
        System.out.println("Все коты любят поспать");

//         Мы не можем вызвать нестатический метод из
//        статического метода, т.к. при этом объект не
//        создаётся, а нестатический метод мы можем
//        вызывать только у объектов.
//        voice();
    }
}
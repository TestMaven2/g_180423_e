package lesson11.task6;

public class Test {

    public static Flyable somethingFlyable = new Flyable() {
        @Override
        public void fly() {
            System.out.println("Что-то летающее летит");
        }
    };

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.fly();

        Bird bird1 = new Bird();
        Bird bird2 = new Bird();

        somethingFlyable.fly();
    }
}

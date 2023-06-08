package lesson11.task3;

public class LocalClassTest {

    public static void main(String[] args) {
        showResult(3, 5);
    }

    public static void showResult(int a, int b) {

        String word = "Hello";

        class MathOperations {
            int sum(int a, int b) {
                return a + b;
            }

            int mul(int a, int b) {
                return a * b;
            }

            int sub(int a, int b) {
                return a - b;
            }

            int div(int a, int b) {
                return a / b;
            }
        }

        MathOperations operations = new MathOperations();
        System.out.println(operations.sum(a, b));
        System.out.println(operations.sub(a, b));
        System.out.println(operations.mul(a, b));
        System.out.println(operations.div(a, b));
    }
}

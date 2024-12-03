package tests;

public class LambdaApp {
    public static void main(String[] args) {
        Operationable operation1 = (x, y) -> x + y;
        Operationable operation2 = (x, y) -> x - y;
        Operationable operation3 = (x, y) -> x * y;
        Operationable operation4 = (x, y) -> x / y;

        System.out.println(operation1.calculate(10, 20));
        System.out.println(operation2.calculate(30, 20));
        System.out.println(operation3.calculate(5, 2));
        System.out.println(operation4.calculate(6, 2));
    }
}
interface Operationable {
    int calculate(int x, int y);
}
package euler.task;
public class Task1 {
    public Task1(){
    }
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 3; i < 1000; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
package euler.task;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 1,
        num2 = 1,
        sum = 0;
        while(num1 < 4000000){
                int temp = 3;
                temp = num1 + num2;
                num1 = num2;
                num2 = temp;
                if(num1 % 2 == 0) {
                    sum += num1;
                    System.out.println(sum);
                }
        }
    }
}

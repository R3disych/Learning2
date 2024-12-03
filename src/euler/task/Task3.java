package euler.task;

public class Task3 {
    public static void main(String[] args) {
        long num = 6000851475143L;
        for(long div = 2; div < num; ++div){
            while(num % div == 0){
                num = num / div;
            }
            System.out.println(num);
        }
    }
}

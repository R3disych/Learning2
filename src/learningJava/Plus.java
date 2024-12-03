package learningJava;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        System.out.println("Введите y");
        int y = sc.nextInt();

        int sum = x + y;

        System.out.println("Сумма x и y равна " + sum);

    }
}


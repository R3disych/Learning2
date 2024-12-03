package tests;

import java.util.Scanner;

public class ScannerTry {
    public static void main(String[] args) {
        Scanner lines = new Scanner(System.in);
        String firstLine = lines.nextLine();
        int secondLine = lines.nextInt();
        int thirdLine = lines.nextInt();
        boolean fourthLine = lines.hasNextByte();
        if(fourthLine) {
            System.out.println(fourthLine);
        }

        System.out.println(firstLine);
        System.out.println((secondLine + thirdLine) / 2);
    }
}
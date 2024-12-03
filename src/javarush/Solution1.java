package javarush;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String answer = s1.equals(s2) ? "строки одинаковые" : "строки разные";
        
    }
}

package tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) throws IOException {
        //while(true) {
        //  int x = System.in.read();
        //  System.out.println(x);
        //}
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println(br);
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\lerau\\OneDrive\\Рабочий стол"));
        //InputStreamReader reader = new InputStreamReader(System.in);
        //while (true) {
          //  int x = reader.read();
          //  System.out.println(x);
        //}
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("Мы считали с консоли следующую строку: ");
        System.out.println(s);
    }
}

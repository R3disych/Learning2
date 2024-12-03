package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = "C:" +separator + separator+ "Users" +separator+ "lerau" +separator+ "OneDrive" +separator+ "Рабочий стол" +separator+ "Текстовый документ.txt";
        System.out.println(path);

        File file = new File(path);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        sc.close();

        String path1 = "C:" +separator+ separator+ "Users" +separator+ "lerau" +separator+ "OneDrive" +separator+ "Рабочий стол" +separator+ "numbers.txt";
        readNumbersFromFile(path1);
    }
    public static void readNumbersFromFile(String path) throws FileNotFoundException {
        File file1 = new File(path);
        Scanner sc1 = new Scanner(file1);
        String line = sc1.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[numbersString.length];
        int counter = 0;

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
    }
}

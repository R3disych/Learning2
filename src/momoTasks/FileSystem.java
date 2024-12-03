package momoTasks;

import tests.ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class FileSystem {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите путь к директории(файлу):");
        String path = userInput.nextLine();

        File inputPath = new File(path);

        outFileTree(inputPath, 0);

        String separator = File.separator;
        String path1 = "C:" + separator + separator + "jetbra" + separator + "numbers.txt";
        ReadingFromFile.readNumbersFromFile(path1);
    }

    public static void outFileTree(File inputPath, int level) {
        File[] files = inputPath.listFiles();
        Arrays.sort(files);
            for(File item : files) {
                if (item.isDirectory()) {
                    System.out.println("\t".repeat(level) + "|----" + item.getName() + " " + item.length() + " байт");
                        outFileTree(item, level +1);
                } else {
                    System.out.println("\t".repeat(level) + "  ---" + item.getName() + " " + item.length() + " байт");
                }
            }
    }
}

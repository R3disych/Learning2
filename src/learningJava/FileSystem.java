package learningJava;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileSystem {
    public static void main(String[] args) {
        System.out.println("Введите путь к директории");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        File myFile = new File(input);
        for (File file : myFile.listFiles())
        {
            System.out.println(file.getName());
        }
        System.out.println("Dir name: " + myFile.getName());
        System.out.println("Parent folder: " + myFile.getParent());
        if(myFile.exists())
            System.out.println("File exists");
        else
            System.out.println("File not found");

        System.out.println("File size: " + myFile.length());
        if(myFile.canRead())
            System.out.println("File can be read");
        else
            System.out.println("File can not be read");

        if(myFile.canWrite())
            System.out.println("File can be written");
        else
            System.out.println("File can not be written");

        // создадим новый файл
        File newFile = new File("C://SomeDir//MyFile");
        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}


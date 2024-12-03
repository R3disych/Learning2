package tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        File file = new File(("C:\\SomeDir\\test.txt"));
        FileOutputStream fileOutputStream = new FileOutputStream(file, true); // при добавлении второго параметра: true, программа будет доваблять введенную строку, а не перезаписывать ее
        //можно сразу передать в параметр путь: FileOutputStream fileOutputStream = new FileOutputStream("C:\\SomeDir\\test.txt");

        String greeting = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!";

        fileOutputStream.write(greeting.getBytes());

        fileOutputStream.close();
    }
}

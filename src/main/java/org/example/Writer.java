package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static void createAndWriteInFile() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные для записи в файл: ");
        String line = scanner.nextLine();

        File file = new File("hw_text.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(line);
            fileWriter.close();
        } catch (
                IOException e) {
            e.getMessage();
        }
    }
}

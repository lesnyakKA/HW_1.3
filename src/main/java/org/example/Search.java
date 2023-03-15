package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Search {
    private void searchFiles(File rootFile, List<File> listFiles) {
        if (rootFile.isDirectory()) {
            System.out.println("DIR | " + rootFile.getName());
            File[] directoryFiles = rootFile.listFiles();
            if (directoryFiles != null) {
                for (File file : directoryFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, listFiles);
                    } else {
                        listFiles.add(file);
                        System.out.println("   File | " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("Файл не может содержать другие файлы. Проверьте правильность указанного пути.");
        }
    }

    public void countingFiles(String path) {
        File file = new File(path);
        List<File> list = new ArrayList<>();
        searchFiles(file ,list);
        System.out.println("--------------------------");
        System.out.println("Общее количество файлов: " + list.size());
    }
}

package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Writer.createAndWriteInFile();
        Reader.readInFile();

        Cat cat = new Cat("Шарик", 7, 1);
        System.out.println(cat.getName());
        System.out.println(cat.getWeight());
        System.out.println(cat.getNumbCountry());

        Search search = new Search();
        search.countingFiles("C:\\");
    }
}
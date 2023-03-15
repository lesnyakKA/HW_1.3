package org.example;

public class Main {
    public static void main(String[] args) {

        Writer.createAndWriteInFile();
        Reader.readInFile();

        Cat cat = new Cat("Шарик", 7, 1);
        System.out.println(cat);
        System.out.println(cat.getNumbCountry());

        Search search = new Search();
        search.countingFiles("D:\\Торрент");
    }
}
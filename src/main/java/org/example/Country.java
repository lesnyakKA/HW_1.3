package org.example;

public enum Country {
    RUSSIA("Россия"), ENGLAND("Англия"), SCOTLAND("Шотландия");

    private String name;

    Country(String name) {
        this.name = name;
    }

    public static String getCountryById(int numb) {
        switch (numb) {
            case 1:
                return Country.RUSSIA.name;
            case 2:
                return Country.ENGLAND.name;
            case 3:
                return Country.SCOTLAND.name;
            default:
                System.out.println("Такой страны не существует");
        }
        return null;
    }
}

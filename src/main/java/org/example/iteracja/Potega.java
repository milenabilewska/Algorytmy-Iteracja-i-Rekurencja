package org.example.iteracja;

public class Potega {
    public static void main(String[] args) {
        int liczba = 3;
        int potega = 4;
        int wynik = 1;
        for (int i = 0; i < potega; i++) {
            wynik *= liczba;
        }
        System.out.println(liczba + "^" + potega + " = " + wynik);
    }
}


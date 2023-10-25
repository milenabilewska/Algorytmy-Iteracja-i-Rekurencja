package org.example.iteracja;

public class KonwersjaNaBinarny {
    public static void main(String[] args) {
        int liczba = 25;
        String binarna = "";
        while (liczba > 0) {
            binarna = liczba % 2 + binarna;
            liczba /= 2;
        }
        System.out.println("Liczba w systemie binarnym: " + binarna);
    }
}

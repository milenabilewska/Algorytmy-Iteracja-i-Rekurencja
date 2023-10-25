package org.example.iteracja;

public class SumaCyfr {
    public static void main(String[] args) {
        int liczba = 12345;
        int suma = 0;
        while (liczba > 0) {
            suma += liczba % 10;
            liczba /= 10;
        }
        System.out.println("Suma cyfr w liczbie: " + suma);
    }
}

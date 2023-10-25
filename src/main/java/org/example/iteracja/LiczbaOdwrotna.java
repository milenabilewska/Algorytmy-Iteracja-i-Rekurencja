package org.example.iteracja;

import java.util.Scanner;

public class LiczbaOdwrotna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        int odwrotna = 0;
        while (liczba != 0) {
            odwrotna = odwrotna * 10 + liczba % 10;
            liczba = liczba / 10;
        }
        System.out.println("Liczba odwrotna: " + odwrotna);
    }
}

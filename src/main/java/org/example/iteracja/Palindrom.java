package org.example.iteracja;


import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj słowo lub zdanie: ");
        String tekst = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");
        String odwrocone = new StringBuilder(tekst).reverse().toString();
        if (tekst.equals(odwrocone)) {
            System.out.println("To jest palindrom.");
        } else {
            System.out.println("To nie jest palindrom.");
        }
    }
}

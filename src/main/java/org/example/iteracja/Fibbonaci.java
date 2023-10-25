package org.example.iteracja;

public class Fibbonaci {

        public static void main(String[] args) {
            int n = 10;
            int wynik = obliczFibonacciego(n);
            System.out.println("Liczba Fibonacciego dla n=" + n + " wynosi: " + wynik);
        }

        public static int obliczFibonacciego(int n) {
            if (n <= 1) {
                return n;
            }
            int a = 0, b = 1;
            int wynik = 0;
            for (int i = 2; i <= n; i++) {
                wynik = a + b;
                a = b;
                b = wynik;
            }
            return wynik;
        }
    }



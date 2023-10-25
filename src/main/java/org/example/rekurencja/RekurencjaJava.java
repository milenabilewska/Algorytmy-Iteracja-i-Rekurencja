package org.example.rekurencja;

public class RekurencjaJava {

    public static void main(String[] args) {
        int liczba = 5;
        int wynik = obliczSilnie(liczba);
        System.out.println("Silnia z " + liczba + " wynosi " + wynik);
    }

    public static int obliczSilnie(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * obliczSilnie(n - 1);
        }
    }
}


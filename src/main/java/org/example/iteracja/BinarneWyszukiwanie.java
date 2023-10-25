package org.example.iteracja;

public class BinarneWyszukiwanie {
    public static void main(String[] args) {
        int[] tablica = {2, 4, 6, 8, 10, 12, 14};
        int szukana = 10;
        int lewy = 0;
        int prawy = tablica.length - 1;
        while (lewy <= prawy) {
            int srodek = (lewy + prawy) / 2;
            if (tablica[srodek] == szukana) {
                System.out.println("Znaleziono " + szukana + " na pozycji " + srodek);
                break;
            } else if (tablica[srodek] < szukana) {
                lewy = srodek + 1;
            } else {
                prawy = srodek - 1;
            }
        }
    }
}

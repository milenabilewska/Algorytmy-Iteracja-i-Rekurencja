package org.example.iteracja;

public class NWD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Największy wspólny dzielnik (NWD): " + a);
    }
}

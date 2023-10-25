public class FibonacciRekurencja {
    public static void main(String[] args) {
        int n = 10;
        int wynik = obliczFibonacciego(n);
        System.out.println("Liczba Fibonacciego dla n=" + n + " wynosi: " + wynik);
    }

    public static int obliczFibonacciego(int n) {
        if (n <= 1) {
            return n;
        } else {
            return obliczFibonacciego(n - 1) + obliczFibonacciego(n - 2);
        }
    }
}

//    Ciąg Fibonacciego można zdefiniować
//    za pomocą rekurencyjnej formuły matematycznej:
//
//F(0) = 0
//F(1) = 1
//F(n) = F(n-1) + F(n-2) dla n > 1
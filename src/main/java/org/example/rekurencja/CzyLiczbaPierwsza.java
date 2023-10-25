public class CzyLiczbaPierwsza {
    public static void main(String[] args) {
        int liczba = 17;
        boolean czyPiersza = czyLiczbaPierwsza (liczba, 2);
        if (czyPiersza ) {
            System.out.println("liczba " + liczba + "   jest liczba pierwszą");
        }
        else  {
            System.out.println("liczba " + liczba + "   nie jest liczba pierwszą");
        }
    }
    public static boolean czyLiczbaPierwsza(int n, int dzielnik) {
        if (n <= 1) {
            return false;
        }
        if (dzielnik == n) {
            return true;
        }
        if (n % dzielnik == 0) {
            return false;
        }
        return czyLiczbaPierwsza(n, dzielnik + 1);
    }
}
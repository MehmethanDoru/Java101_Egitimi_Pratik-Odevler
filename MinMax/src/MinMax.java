import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 1, min = 1, i, sayi;
        System.out.print("Kac tane sayi gireceksiniz: ");
        int n = input.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print(i + ". Sayiyi giriniz: ");
            sayi = input.nextInt();

            if (i == 1) {
                max = sayi;
                min = sayi;
            }

            if (sayi < min) {
                min = sayi;
            }

            if (sayi > max) {
                max = sayi;
            }
        }

        System.out.println("En buyuk sayi: " + max + "\nEn kucuk sayi: " + min);
    }
}

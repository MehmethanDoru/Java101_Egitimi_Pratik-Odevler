//  Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
//  Örnek : 1643 = 1 + 6 + 4 + 3 = 14
import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam=0, a;

        System.out.print("Sayi giriniz: ");
        sayi = input.nextInt();

        while (sayi != 0) {
            a = sayi % 10;
            toplam += a;
            sayi /= 10;
        }

        System.out.println("Basamak sayilarinin toplami: " + toplam);
    }
}

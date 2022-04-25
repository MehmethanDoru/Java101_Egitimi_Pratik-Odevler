import java.util.Scanner;

public class PalindromSayi {
    static int palindrom(int sayi) {
        int temp = sayi, basamak, tersSayi = 0;

        while (temp != 0) {
            basamak = temp % 10;
            tersSayi = (tersSayi*10) + basamak;
            temp /= 10;
        }
        return tersSayi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, tersSayi;

        System.out.print("Sorgulamak istediginiz sayiyi giriniz: ");
        sayi = input.nextInt();

        tersSayi = palindrom(sayi);

        if (tersSayi == sayi) {
            System.out.println(sayi + " palindrom bir sayidir.");
        } else {
            System.out.println(sayi + " palindrom bir sayi degildir.");
        }
    }
}

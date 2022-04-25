/* KURAL: Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın. */

import java.util.Scanner;

public class Desen {
    static void desen(int n) {

        if (n < 1) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        desen(n-5);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int baslangic;
        Scanner input = new Scanner(System.in);

        System.out.print("Baslangic degerini giriniz: ");
        baslangic = input.nextInt();

        desen(baslangic);
    }
}
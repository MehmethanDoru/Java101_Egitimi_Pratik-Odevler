import java.util.Scanner;

public class HesapMakinesi {
    static Scanner input = new Scanner(System.in);

    static void toplama() { // "0" girene kadar sayı alır.
        int sayi, i = 1, sonuc = 0;

        while (true) {
            System.out.print(i + ". sayi: ");
            sayi = input.nextInt();

            if (sayi == 0) {
                break;
            }
            sonuc += sayi;
            i++;
        }

        System.out.println("Islem Sonucu: " + sonuc + "\n\n");
    }

    static void cikarma() {
        int sayi, sonuc = 0;
        System.out.print("Kac adet sayi gireceksiniz: ");
        int adet = input.nextInt();

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayi: " );
            sayi = input.nextInt();

            if (i == 1) {
                sonuc = sayi;
                continue;
            }

            sonuc -= sayi;
        }

        System.out.println("Islem Sonucu: " + sonuc + "\n\n");
    }

    static void carpma() { // 1 girene kadar sayı alır.
        int sayi, i = 1, sonuc = 1;

        do {
            System.out.print(i + ". sayi: ");
            sayi = input.nextInt();

            if (sayi == 0) {
                sonuc = 0;
                break;
            }

            sonuc *= sayi;
            i++;
        } while (sayi != 1);

        System.out.println("Islem Sonucu: " + sonuc + "\n\n");
    }

    static void bolme() { //.1
        double sayi, i = 1, sonuc = 0.0;

        System.out.print("Kac adet sayi gireceksiniz :");
        int adet = input.nextInt();

        for (i = 1; i <= adet; i++) {
            System.out.print((int) i + ". sayi :");
            sayi = input.nextDouble();

            if (i != 1 && sayi == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }

            if (i == 1) {
                sonuc = sayi;
                continue;
            }
            sonuc /= sayi;
        }

        System.out.println("Islem Sonucu: " + sonuc + "\n\n");
    }

    static void uslu() {
        int taban, us, sonuc = 1;

        System.out.print("Hesaplamak istediginiz sayiyi giriniz: ");
        taban = input.nextInt();
        System.out.print("Ussu giriniz: ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Islem Sonucu: " + sonuc + "\n\n");
    }

    static void fact() {
        int sayi, sonuc = 1;

        System.out.print("Hangi sayinin faktoriyelini hesaplamak istiyorsunuz: ");
        sayi = input.nextInt();

        for (int i = sayi; i >= 1; i--) {
            sonuc *= i;
        }

        System.out.println("Islem Sonucu: " + sonuc + "\n\n");
    }

    static void mod() {
        int sayi, mod, sonuc = 0;

        System.out.print("Sayiyi giriniz: ");
        sayi = input.nextInt();
        System.out.print("Mod almak istediginiz degerini giriniz: ");
        mod = input.nextInt();

        sonuc = sayi % mod;

        System.out.println("Islem Sonucu: " + sonuc + "\n\n");
    }

    static void dikdortgen() {
        int kisaKenar, uzunKenar, alan, cevre;

        System.out.print("Dikdortgenin kisa kenarini giriniz: ");
        kisaKenar = input.nextInt();
        System.out.print("Dikdortgenin uzun kenarini giriniz: ");
        uzunKenar = input.nextInt();

        cevre = (kisaKenar*2) + (uzunKenar*2);
        alan = kisaKenar * uzunKenar;

        System.out.println("Kenarlari girilen dikdortgenin\ncevresi: " + cevre + "\nalani: " + alan + "\n\n");
    }

    public static void main(String[] args) {

    int secim;

    String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve cevre Hesabi\n"
                + "0- Cikis Yap";

    do {
        System.out.println(menu);
        System.out.print("Yapmak istediginiz islemi seciniz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                toplama();
                break;
            case 2:
                cikarma();
                break;
            case 3:
                carpma();
                break;
            case 4:
                bolme();
                break;
            case 5:
                uslu();
                break;
            case 6:
                fact();
                break;
            case 7:
                mod();
                break;
            case 8:
                dikdortgen();
                break;
            case 0:
                System.out.println("Cikis Yapiliyor...");
                break;
            default:
                System.out.println("Hatali bir giris yaptiniz! Tekrar deneyiniz.");
        }
    } while (secim != 0);
    }
}
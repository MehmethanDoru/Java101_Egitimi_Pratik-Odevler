import java.util.Scanner;

public class KuvvetHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, kuvvet;

        System.out.print("Us almak istediginiz sayiyi giriniz: ");
        sayi = input.nextInt();
        System.out.print("Us degerini giriniz: ");
        kuvvet = input.nextInt();

        int sonuc = (int) Math.pow(sayi,kuvvet);
        System.out.printf("%d^%d = %d",sayi, kuvvet, sonuc);
    }
}

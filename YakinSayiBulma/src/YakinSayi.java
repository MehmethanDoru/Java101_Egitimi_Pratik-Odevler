import java.util.Scanner;

public class YakinSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int fark = 0, fark2 = 0, enKucukYakin = 0, enBuyukYakin = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] < sayi) {
                fark = sayi - dizi[i];
                if (fark <= fark2) {
                    enKucukYakin = dizi[i];
                }
            }
            fark2 = fark;
        }
        fark = 0; fark2 = 0;
        System.out.println("Girilen sayidan kucuk en yakin sayi : " + enKucukYakin);

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > sayi) {
                fark = dizi[i] - sayi;
                if (fark <= fark2) {
                    enBuyukYakin = dizi[i];
                }
            }
            fark2 = fark;
        }
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + enBuyukYakin);
    }
}

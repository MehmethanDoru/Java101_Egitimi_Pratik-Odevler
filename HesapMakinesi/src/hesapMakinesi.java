import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int sayi1, sayi2, islem;
        double sonuc = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        sayi2 = input.nextInt();

        System.out.print("\nYapmak istediginiz islemi seciniz:\n1 = Toplama\n2 = Cikarma\n3 = Carpma\n4 = Bolme\n");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                sonuc = (double) (sayi1 + sayi2);
                System.out.printf("Sonuc: %.2f",sonuc);
                break;
            case 2:
                sonuc = (double) (sayi1 - sayi2);
                System.out.printf("Sonuc: %.0f",sonuc);
                break;
            case 3:
                sonuc = (double) (sayi1 * sayi2);
                System.out.printf("Sonuc: %.0f",sonuc);
                break;
            case 4:
                sonuc = (sayi2 != 0) ? ((double) sayi1 / sayi2) : -1 ;
                    if (sonuc == -1) {
                        System.out.println("0'a bolunemez!");
                    } else {
                        System.out.printf("Sonuc: %.2f",sonuc);
                    }
                    break;
            default:
                System.out.println("Hatali giris yaptiniz!");
        }
    }
}

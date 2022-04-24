// Kullanıcı adı : lorem && Şifre : ipsum2022
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bakiye = 1500, deneme = 3, secim;
        String KULLANICIADI = "lorem", SIFRE = "ipsum2022";
        String kullaniciAdi, sifre;

        while (deneme > 0){
            System.out.print("Kullanici adini giriniz: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Sifrenizi giriniz: ");
            sifre = input.nextLine();

            if (kullaniciAdi.equals(KULLANICIADI) && sifre.equals(SIFRE)) {
                System.out.println("Merhaba! Bankamiza hos geldiniz.");
                do {
                    System.out.println("Yapmak istediginiz islemi seciniz:");
                    System.out.print("1-Bakiye Sorgulama\n2-Para Yatirma\n3-Para Cekme\n4-Cikis\n");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Bakiyeniz: " + bakiye + "TL\n");
                            break;
                        case 2:
                            System.out.print("Yatirmak istediginiz tutar: ");
                            int miktar = input.nextInt();
                            bakiye += miktar;
                            break;
                        case 3:
                            System.out.println("Maks. cekilebilir tutar: " + bakiye + "TL" + "\nCekmek istediginiz tutari giriniz: ");
                            miktar = input.nextInt();
                            if (miktar > bakiye) {
                                System.out.print("Bakiye Yeteriz!");
                            } else {
                                bakiye -= miktar;
                            }
                            break;
                        case 4:
                            System.out.println("Tekrar Gorusmek Uzere...");
                            break;
                        default:
                            System.out.println("Hatali Giris Yaptiniz!");
                            break;
                    }

                } while (secim != 4);
                break;
            } else {
                deneme--;
                if (deneme == 0) {
                    System.out.println("Kartiniz bloke olmustur. Banka ile iletisime geciniz.");
                } else {
                    System.out.printf("Yanlis giris yaptiniz! Kalan deneme hakkiniz %d\n", deneme);
                }
            }
        }
    }
}

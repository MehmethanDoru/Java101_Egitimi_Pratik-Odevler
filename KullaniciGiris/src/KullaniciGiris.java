import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String KULLANICIADI, SIFRE;
        String kullaniciAdi, sifre, yeniSifre;
        int dogrulama;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici adi olusturun: ");
        KULLANICIADI = input.next();
        System.out.print("Sifre olusturun: ");
        SIFRE = input.next();

        System.out.println("Kullanci adi ve sifre basari ile olusturuldu!");

        System.out.println("\nGiris yapma sayfasina yonlendiriliyorsunuz...");

        System.out.print("Kullanici adiniz: ");
        kullaniciAdi = input.next();
        System.out.print("Sifreniz: ");
        sifre = input.next();

        if((KULLANICIADI.equals(kullaniciAdi)) && (SIFRE.equals(sifre))) {
            System.out.println("Basari ile giris yapildi");
        } else {
            System.out.println("Kullanici adi ve/veya Sifre hatali! Sifreyi sifirlamak isterseniz 1'e basiniz.");
            dogrulama = input.nextInt();
            if(dogrulama == 1) {
                System.out.print("Yeni sifrenizi olusturun: ");
                yeniSifre = input.next();
                if( (yeniSifre.equals(sifre)) || (yeniSifre.equals(SIFRE))) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else {
                    SIFRE = yeniSifre;
                    System.out.println("Sifre olusturuldu");
                }
            } else {
                System.out.println("Sistemden cikis yapildi.");
            }
        }
    }
}

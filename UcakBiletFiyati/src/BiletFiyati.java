import java.util.Scanner;

public class BiletFiyati {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double KM=0.10, indCocuk=0.5, indGenc=0.1, indYasli=0.3, indCiftBilet=0.2;
        double fiyat;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe bilgisini (km) giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yasinizi giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yon , 2 => Gidis-Donus ): ");
        yolculukTipi = input.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            fiyat = mesafe*KM;
            if (yas <= 12){
                fiyat = fiyat - (fiyat*indCocuk);
            } else if (yas <= 24) {
                fiyat = fiyat - (fiyat*indGenc);
            } else if (yas >= 65) {
                fiyat = fiyat - (fiyat*indYasli);
            }
            if (yolculukTipi == 2) {
                fiyat = ( fiyat - (fiyat*indCiftBilet) ) * 2;
            }

            System.out.println("Toplam tutar: " + fiyat + "TL");
        } else {
            System.out.println("Hatali Veri Girdiniz!");
        }
    }
}

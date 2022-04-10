/* Açılış ücreti: 10TL
   Km başına ücret: 2.20TL
   Minimum ödenecek tutar: 20TL */

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km, baslangic=10;
        float ucret, perKm = 2.20f;

        Scanner input = new Scanner(System.in);
        System.out.print("Kac km yol yapildi? ");
        km = input.nextInt();

        ucret = (float) (baslangic + (km*perKm));

        ucret = (ucret > 20) ? ucret : 20;

        System.out.printf("Odenecek Tutar: %.1fTL",ucret);
    }
}

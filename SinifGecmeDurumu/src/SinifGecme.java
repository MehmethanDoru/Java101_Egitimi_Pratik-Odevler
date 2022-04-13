import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, toplam=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextInt();
        if ( matematik>=0 && matematik<=100) {
            toplam += matematik;
        }

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if ( fizik>=0 && fizik<=100) {
            toplam += fizik;
        }

        System.out.print("Turkce notunu giriniz: ");
        turkce = input.nextInt();
        if ( turkce>=0 && turkce<=100) {
            toplam += turkce;
        }

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if ( kimya>=0 && kimya<=100) {
            toplam += kimya;
        }

        System.out.print("Muzik notunu giriniz: ");
        muzik = input.nextInt();
        if ( muzik>=0 && muzik<=100) {
            toplam += muzik;
        }

        double ortalama = toplam / 5;
        System.out.println("\nOrtalamaniz: " + ortalama);
        String sonuc = (ortalama>55) ? "Sinifi Gectiniz" : "Sinifta Kaldiniz";
        System.out.println(sonuc);

    }
}

import java.util.Scanner;

public class SartliOrtalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam=0, sayac=0;

        System.out.print("Sayi giriniz: ");
        sayi = input.nextInt();

        for (int i=0; i<=sayi; i++) {
            if (i%12 == 0 && i!=0) {
                toplam += i;
                sayac++;
            }
        }

        double ortalama = (double) toplam / sayac;
        System.out.println("3 ve 4'e tam bolunen sayilarin ortalamasi: " + ortalama);
    }
}

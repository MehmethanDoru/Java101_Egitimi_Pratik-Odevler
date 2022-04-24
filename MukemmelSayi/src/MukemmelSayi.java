import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
    int carpanToplam = 0, sayi, i;
    Scanner input = new Scanner(System.in);

    System.out.print("Sayi giriniz: ");
    sayi = input.nextInt();

    for (i = 1; i < sayi; i++) {
        if (sayi % i == 0) {
            carpanToplam += i;
        }
    }

    if (carpanToplam == sayi) {
        System.out.println(sayi + " mukemmel sayidir.");
    } else {
        System.out.println(sayi + " mukemmel sayi degildir.");
    }

    }
}

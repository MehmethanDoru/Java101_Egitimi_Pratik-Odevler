import java.util.Scanner;

public class SartliToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, toplam=0;

        do {
            System.out.print("Sayi giriniz: ");
            sayi  = input.nextInt();
                if (sayi%4 == 0) {
                    toplam += sayi;
                }
        } while (sayi % 2 == 0);

        System.out.println("4'un katlari olan sayilarin toplami: " + toplam);
    }
}

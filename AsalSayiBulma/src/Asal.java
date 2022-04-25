import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        int sayi;
        boolean isAsal = true;
        Scanner input = new Scanner(System.in);

        System.out.print("Sorgulamak istediginiz sayiyi giriniz: ");
        sayi = input.nextInt();

        if (sayi == 1 || sayi == 0) {
            isAsal = false;
        }

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                isAsal = false;
            }
        }

        if (isAsal) {
            System.out.println("Girdiginiz sayi asaldir!");
        } else {
            System.out.println("Girdiginiz sayi asal degildir!");
        }
    }
}

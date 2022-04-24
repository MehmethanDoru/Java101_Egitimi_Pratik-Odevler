import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, ebob = 1, ekok = 1;

        System.out.print("Birinci sayiyi giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        sayi2 = input.nextInt();

        int i=1;
        while (i != sayi1) {
            if (sayi1 % i == 0) {
                if (sayi2 % i == 0){
                    ebob = i;
                }
            }
            i++;
        }

        i=1;
        int carpim = (sayi1*sayi2);
        while (i != carpim) {
            if (i % sayi1 == 0) {
                if (i % sayi2 == 0) {
                    ekok = i;
                }
            }
            i++;
        }

        System.out.println("Girdiginiz sayilarin\nebobu:  " + ebob + "\nekoku: " + ekok);
    }
}

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

import java.util.Scanner;

public class KuvvetHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sinir;

        System.out.print("Sinir icin bir sayi giriniz: ");
        sinir = input.nextInt();

        System.out.println("4 ve 5'in kuvvetleri");

        for (int i=0; i<sinir; i++) {
            int dort = (int) Math.pow(4,i);
            int bes = (int) Math.pow(5,i);
            System.out.printf("\n4^%d = %d ||| 5^%d = %d\n",i, dort, i, bes);
        }
    }
}

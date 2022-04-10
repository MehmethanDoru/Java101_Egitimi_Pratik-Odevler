/* Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL */

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        int armut, elma, domates, muz, patlican;
        double fArmut=2.14, fElma=3.67, fDomates=1.11, fMuz=0.95, fPatlican=5;
        double toplam=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kac kilo: ");
        armut = inp.nextInt();
        toplam += (armut*fArmut);

        System.out.print("Elma kac kilo: ");
        elma = inp.nextInt();
        toplam += (elma*fElma);

        System.out.print("Domates kac kilo: ");
        domates = inp.nextInt();
        toplam += (domates*fDomates);

        System.out.print("Muz kac kilo: ");
        muz = inp.nextInt();
        toplam += (muz*fMuz);

        System.out.print("Patlican kac kilo: ");
        patlican = inp.nextInt();
        toplam += (patlican*fPatlican);

        System.out.printf("Toplam tutar: %.2fTL",toplam);
    }
}

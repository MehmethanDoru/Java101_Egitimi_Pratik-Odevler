//N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
// n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
// C(n,r) = n! / (r! * (n-r)!)

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kume, grup, kumeFact=1, grupFact=1, kgFact=1;

        System.out.print("Kume kac elemanli olacak: ");
        kume = input.nextInt();
        System.out.print("Kac farkli grup olusturulacak: ");
        grup = input.nextInt();

        for (int i=1; i <= kume; i++ ) {
            kumeFact *= i;
        }
        for (int i=1; i <= grup; i++) {
            grupFact *= i;
        }
        for (int i=1; i <= (kume-grup); i++) {
            kgFact *= i;
        }

        double kombinasyon = kumeFact / (grupFact*kgFact);
        System.out.println("C(n,r) = " + kombinasyon);
    }
}

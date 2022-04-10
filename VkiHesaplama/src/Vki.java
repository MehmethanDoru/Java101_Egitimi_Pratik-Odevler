//Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
// Aşağıda ki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
// Kilo (kg) / Boy(m) * Boy(m)
import java.util.Scanner;

public class Vki {
    public static void main(String[] args) {
        int kilo;
        double boy, vki;
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextInt();

        vki = kilo / (boy*boy);

        System.out.printf("Vucut kitle indeksiniz: %f",vki);
    }
}

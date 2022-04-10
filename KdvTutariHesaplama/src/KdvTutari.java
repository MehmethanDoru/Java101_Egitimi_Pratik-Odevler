import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        int fiyat;
        float yeniFiyat;

        Scanner input = new Scanner(System.in);
        System.out.print("Ham fiyati giriniz: ");
        fiyat = input.nextInt();

        float kdv = fiyat<1000 ? 0.18f : 0.08f;

        yeniFiyat = fiyat + (fiyat*kdv);

        System.out.println("\nKDV'siz fiyat: " + fiyat + "\nKDV orani: " + kdv +
                "\nKDV tutari: " + String.format("%.2f",yeniFiyat - fiyat) + "\nKDV'li fiyat: " + yeniFiyat);
    }
}




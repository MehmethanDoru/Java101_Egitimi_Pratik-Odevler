import java.util.Scanner;
import java.util.Arrays;

public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayisini giriniz: ");
        int boyut = input.nextInt();

        int[] dizi = new int[boyut];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Dizinin " + (i+1) + ". elemanini giriniz: ");
            dizi[i] = input.nextInt();
        }

        System.out.println();

        System.out.print("Orijinal dizi: ");
        for (int k : dizi) {
            System.out.print(k + " ");
        }

        System.out.println("\n");

        Arrays.sort(dizi);
        System.out.print("Siralanmis dizi: ");
        System.out.print(Arrays.toString(dizi));
    }
}

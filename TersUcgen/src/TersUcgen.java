import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamak;

        System.out.print("Basamak sayisini giriniz: ");
        basamak = input.nextInt();

        for (int i = basamak-1; i >= 0; i--) {
            for (int j=0; j < (basamak-i)-1; j++) {
                System.out.print(" ");
            }
            for (int k=0; k <= (i*2); k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

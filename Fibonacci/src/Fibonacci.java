import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elemanSayi;

        System.out.print("Fibonacci dizisinin eleman sayisini giriniz: ");
        elemanSayi = input.nextInt();

        System.out.print("0 ");
        System.out.print("1 ");

        int ilk = 0, ikinci = 1, siradaki;

        for (int i = 2; i < elemanSayi; i++) {
            siradaki = ilk + ikinci;

            System.out.print(siradaki + " ");

            ilk = ikinci;
            ikinci = siradaki;
        }
    }
}

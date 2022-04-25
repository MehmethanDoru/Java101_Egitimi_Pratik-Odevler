// 0 1 1 2 3 5 8 13 21..
import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n) {
        if (n == 1) {
            return 0;
        }

        if (n == 2 || n == 3) {
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Kacinci degeri istiyorsunuz: ");
    int sayi = input.nextInt();

    System.out.println(sayi + ". fibonacci degeri: " + fibo(sayi) );
    }
}
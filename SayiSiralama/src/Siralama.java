// Sayıları küçükten büyüğe doğru sıralama

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        a = input.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        b = input.nextInt();

        System.out.print("Ucuncu sayiyi giriniz: ");
        c = input.nextInt();

        if (a<b && a<c){
            if (b<c) {
                System.out.println("a < b < c");
            } else { // (c<b)
                System.out.println("a < c < b");
            }
        } else if (b<a && b<c){
            if (a<c){
                System.out.println("b < a < c");
            } else { // (c<a)
                System.out.println("b < c < a");
            }
        } else { // (c<a && c<b)
            if (a < b) {
                System.out.println("c < a < b");
            } else { //(b<a)
                System.out.println("c < b < a");
            }
        }
    }
}

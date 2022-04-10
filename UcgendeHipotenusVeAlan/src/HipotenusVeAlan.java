import java.util.Scanner;

public class HipotenusVeAlan {
    public static void main(String[] args) {
        double a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.print("Dik kenarlarin uzunlugunu giriniz:\n");
        a = input.nextInt();
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b) );
        System.out.println("Hipotenus: " + String.format("%.2f",c));

        double cevre = (a+b+c), u = (cevre/2), alan;

        alan = Math.sqrt( u * (u-a) * (u-b) * (u-c) );

        System.out.printf("Birinci Kenari: %.1f\nIkinci Kenari: %.1f\nUcuncu Kenari: %.1f\n", a,b,c);
        System.out.printf("Ucgenin Cevresi: %.1f\nUcgenin Alani: %.1f",cevre,alan);
    }
}

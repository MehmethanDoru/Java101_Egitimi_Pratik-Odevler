import java.util.Scanner;

public class Us {
    public static void main(String[] args) {
        int taban, us, sonuc = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Tabani giriniz: ");
        taban = input.nextInt();
        System.out.print("Ussu giriniz: ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + " uzeri " + us + " = " + sonuc);
    }
}

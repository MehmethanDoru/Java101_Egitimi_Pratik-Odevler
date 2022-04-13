import java.util.Scanner;

public class BurcHesapla {
    public static void main(String[] args) {
        String ay;
        int gun;
        Scanner input = new Scanner(System.in);

        System.out.println("Dogum tarihiniz (12 subat formatinda) nedir? ");
        gun = input.nextInt();
        ay = input.next();

        if (ay.equals("ocak")) {
            if (gun <= 21) {
                System.out.println("Burcunuz: Oglak");
            } else {
                System.out.println("Burcunuz: Kova");
            }
        } else if (ay.equals("subat")) {
            if (gun <= 19) {
                System.out.println("Burcunuz: Kova ");
            } else {
                System.out.println("Burcunuz: Balik");
            }
        } else if (ay.equals("mart")) {
            if (gun <= 20) {
                System.out.println("Burcunuz: Balik");
            } else {
                System.out.println("Burcunuz: Koc");
            }
        } else if (ay.equals("nisan")) {
            if (gun <= 20) {
                System.out.println("Burcunuz: Koc");
            } else {
                System.out.println("Burcunuz: Boga ");
            }
        } else if (ay.equals("mayis")) {
            if (gun <= 22) {
                System.out.println("Burcunuz: Boga");
            } else {
                System.out.println("Burcunuz: Ikizler");
            }
        } else if (ay.equals("haziran")) {
            if (gun <= 22) {
                System.out.println("Burcunuz: Ikizler");
            } else {
                System.out.println("Burcunuz: Yengec");
            }
        } else if (ay.equals("temmuz")) {
            if (gun <= 22) {
                System.out.println("Burcunuz: Yengec");
            } else {
                System.out.println("Burcunuz: Aslan");
            }
        } else if (ay.equals("agustos")) {
            if (gun <= 22) {
                System.out.println("Burcunuz: Aslan");
            } else {
                System.out.println("Burcunuz: Basak");
            }
        } else if (ay.equals("eylul")) {
            if (gun <= 22) {
                System.out.println("Burcunuz: Basak");
            } else {
                System.out.println("Burcunuz: Terazi");
            }
        } else if (ay.equals("ekim")) {
            if (gun <= 22) {
                System.out.println("Burcunuz: Terazi");
            } else {
                System.out.println("Burcunuz: Akrep");
            }
        } else if (ay.equals("kasim")) {
            if (gun <= 21) {
                System.out.println("Burcunuz: Akrep");
            } else {
                System.out.println("Burcunuz: Yay");
            }
        } else if (ay.equals("aralik")) {
            if (gun <= 21) {
                System.out.println("Burcunuz: Yay");
            } else {
                System.out.println("Burcunuz: Oglak");
            }
        }
    }
}

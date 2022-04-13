import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicakligi giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsin.");
        } else if (sicaklik <= 25) {
            if (sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsin.");
            } if (sicaklik >= 10){
                System.out.println("Piknige gidebilirsin.");
            }
        } else {
            System.out.println("Yuzmeye gidebilirsin.");
        }
    }
}

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        boolean isArtik = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Yil giriniz: ");
        yil = input.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                isArtik = true;
            }
        } else {
            if (yil % 4 == 0) {
                isArtik = true;
            }
        }
        if (isArtik){
            System.out.println(yil + " bir artik yildir.");
        } else {
            System.out.println(yil + " bir artik yil degildir.");
        }
    }
}

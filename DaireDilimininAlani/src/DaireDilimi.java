import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {
        int r, merkezAci;
        float pi=3.14f, dilimAlan;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yaricapini ve merkez acisinin olcusunu giriniz:\n");
        r = input.nextInt();
        merkezAci = input.nextInt();

        dilimAlan = (pi * (r*r) * merkezAci) / 360;
        System.out.printf("%d yaricapli %d merkez acili daire diliminin alani: %.2f",r,merkezAci,dilimAlan);
    }
}

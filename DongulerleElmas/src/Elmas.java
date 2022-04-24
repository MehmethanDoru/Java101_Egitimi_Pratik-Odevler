//    *
//   ***
//  *****
// *******
//*********       == sayi = 4   ==>  4*2+1  ==>  (sayi*2)+1
// *******
//  *****
//   ***
//    *
import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();
        for (int i=0; i<=sayi; i++) {
            for (int j=0; j<= (sayi-i-1); j++) {
                System.out.print(" ");
            }
            for (int a=0; a<(i*2+1); a++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i=(sayi);i>=0;i--)
        {
            for(int j=0;j<(sayi-i+1);j++)
            {
                System.out.print(" ");
            }

            for ( int k=0;k<(2*i)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

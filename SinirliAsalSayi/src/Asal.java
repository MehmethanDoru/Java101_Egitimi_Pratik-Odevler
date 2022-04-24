import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean isAsal = true;

    System.out.print("2 ");

    for (int i = 3; i <= 100; i++) {
        isAsal = true;
        
        for (int j = 2; j < i; j++ ) {
            if (i % j == 0) {
                isAsal = false;
            }
        }

        if (isAsal) {
            System.out.print(i + " ");
        }
    }

    }
}

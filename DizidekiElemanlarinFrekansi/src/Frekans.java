public class Frekans {
    static boolean isFind(int[] arr, int deger) {
        for (int i : arr) {
            if (i == deger) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] tekrarDizisi = new int[dizi.length];

        int sayac = 0, indis = 0;

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if ((i != j) && dizi[i] == dizi[j]) {
                    sayac++;
                }
            }
            if (!isFind(tekrarDizisi, dizi[i])) {
                tekrarDizisi[indis++] = dizi[i];
                System.out.print(dizi[i] + " sayisi " + sayac + " kez tekrar etti.\n");
            }
            sayac = 0;
        }
    }
}
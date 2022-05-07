public class CiftTekrarlar {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] dizi = {3, 5, 6, 6, 8, 9, 11 ,8, 14, 6, 11, 14, 5};
        int[] esitDegerDizisi = new int[dizi.length];
        int indis = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                for (int j = 0; j < dizi.length; j++) {
                    if ( (i != j) && (dizi[i] == dizi[j]) ) {
                        if ( !isFind(esitDegerDizisi, dizi[i]) ) {
                            esitDegerDizisi[indis++] = dizi[i];
                            break;
                        }
                    }
                }
            }
        }

        for (int value : esitDegerDizisi){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}

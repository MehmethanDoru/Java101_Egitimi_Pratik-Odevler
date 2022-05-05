import java.util.Arrays;

public class DiziHarmonik {
    public static void main(String[] args) {
        int[] dizi = {2, 4, 8, 16, 5, 28, 3, 7};
        double toplam = 0.0;

        for (int i = 0; i < dizi.length; i++) {
            toplam += 1.0 / dizi[i];
        }

        double sonuc = (dizi.length / toplam);
        System.out.println(Arrays.toString(dizi) + " dizisinin harmonik ortalamasi : " + sonuc);
    }
}

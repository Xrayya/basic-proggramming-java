package PrakPemdas.Pertemuan;

public class Sorting {

    public static int[] bubble(int[] arr) {
        int[] hasilUrut = arr;
        for (int i = 0; i < hasilUrut.length - 1; i++) {
            boolean swaped = false;

            for (int j = 0; j < hasilUrut.length - i - 1; j++) {
                if (hasilUrut[j] > hasilUrut[j + 1]) {
                    int temp = hasilUrut[j];
                    hasilUrut[j] = hasilUrut[j + 1];
                    hasilUrut[j + 1] = temp;

                    swaped = true;
                }
            }

            // System.out.print("[ ");
            // for (int k : hasilUrut) {
            //     System.out.printf("%d ", k);
            // }
            // System.out.print("]\n");

            if (!swaped) {
                break;
            }
        }
        return hasilUrut;
    }
}

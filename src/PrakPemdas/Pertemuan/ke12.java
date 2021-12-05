package PrakPemdas.Pertemuan;

import java.util.Scanner;

public class ke12 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
    // TODO: coba buat kode:
    // - method yg menjumlahkan semua digit
    // - program yg menampilkan hasil dari perkalian n angka prima pertama
    // - fungsi rekursif
    // - sort (bubble sort)
    // - menambahkan 1 elemen dalam array yang sudah penuh

        long input = in.nextLong();
        System.out.println(Rekursif.jumlahSemuaDigit(input));

        System.out.println("=====================");

        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int[] hasilBubbleSort = Sorting.bubble(arr);
        for (int i : hasilBubbleSort) {
            System.out.printf("%d, ", i);
        }

        System.out.println("=====================");
        // TODO: algoritma ini tidak sempurna, hasil yang harus dikeluarkan adalah array awal,
        // bukan array Jumlah digit.

        in.nextLine();
        String s = in.nextLine();
        int[] bil = StringConvert.toIntArr(s);
        int[] jumlahDigitBil = new int[bil.length];
        for (int i = 0; i < jumlahDigitBil.length; i++) {
            jumlahDigitBil[i] = DigitFormat.JumlahDigit(bil[i]);
        }
        for (int i : Sorting.bubble(jumlahDigitBil)) {
            System.out.printf("%d ", i);
        }
    }
}
